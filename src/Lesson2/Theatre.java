package Lesson2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by dev on 2/12/2015.
 */
public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows -1);
        for (char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price = 12.00;
                if((row < 'D') && (seatNum >= 4 && seatNum <= 9)){
                    price = 14.00;
                } else if((row < 'F') && (seatNum < 4 || seatNum > 9)) {
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
//        BINARY SEARCH IMPLEMENTED IN JAVA CORE
//        int low = 0;
//        int high = seats.size()-1;
//        while (low <= high) {
//            System.out.println(".");
//            int mid = (low + high) >>> 1;
//            Seat midVal = seats.get(mid);
//            int cmp = midVal.getSeatNumber().compareTo(seatNumber);
//
//            if (cmp < 0)
//                low = mid + 1;
//            else if (cmp > 0)
//                high = mid - 1;
//            else
//                return seats.get(mid).reserve(); // key found
//        }
//        System.out.println("There is no seat " + seatNumber);
//        return false;

        Seat requestedSeat = new Seat(seatNumber, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if(foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }

    // for testing
    public Collection<Seat> getSeats() {
        return seats;
    }

    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareTo(seat.getSeatNumber());
        }

        public boolean reserve() {
            if(!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if(this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }
    }



















}