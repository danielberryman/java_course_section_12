package Lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8, 12);
//	    the below is a shallow copy (theatre and theatre copy are shared objects)
//	    List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
//	    printList(seatCopy);

	    if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        if(theatre.reserveSeat("B13")) {
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat already reserved");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);

        printList(priceSeats);

////        theatre.getSeats();
//        if(theatre.reserveSeat("B13")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
//        if(theatre.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }

//        Car car1 = new Car("sterling");
//        Car car2 = new Car("red");
//
//        System.out.println(car1.compareTo(car2));
    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat: list) {
            System.out.println(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("===================================================");
    }

//    public static void sortList(List<? extends Theatre.Seat> list) {
//        for(int i=0; i<list.size()-1; i++) {
//            for (int j= i+1; j<list.size(); j++) {
//                if(list.get(i).compareTo(list.get(j)) > 0) {
//                    Collections.swap(list, i, j);
//                }
//            }
//        }
//    }
}
