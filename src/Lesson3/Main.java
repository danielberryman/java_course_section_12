package Lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Show lesMiz = new Show("les miz");
        lesMiz.add("at the end of the day");
        lesMiz.add("one day more");
        lesMiz.add("castle on a cloud");
        lesMiz.add("barricade");
        lesMiz.addCount(3000);
        lesMiz.addCount(400);
        lesMiz.addCount(2673);
        lesMiz.addCount(2780);

        printSongList(lesMiz);
        printCapacityList(lesMiz);

        Collections.sort(lesMiz.getSongs());
        Collections.sort(lesMiz.getCapacityCounts());
//
//        printSongList(lesMiz);
//        printCapacityList(lesMiz);

//        Collections.reverse(lesMiz.getSongs());
//        Collections.reverse(lesMiz.getCapacityCounts());

        Collections.shuffle(lesMiz.getSongs());
        Collections.shuffle(lesMiz.getCapacityCounts());

        printSongList(lesMiz);
        printCapacityList(lesMiz);

        Show lesMizCopy = new Show("les miz copy");
        List<String> songList2 = new ArrayList<>(lesMiz.getSongs().size());
        for(int i=0; i<lesMiz.getSongs().size(); i++) {
            songList2.add("");
        }
        Collections.copy(songList2, lesMiz.getSongs());
        System.out.println("Song List 2 +++++++++++++++++++++++");
        for(int i=0; i<songList2.size(); i++) {
            System.out.println(songList2.get(i));
        }

        songList2.remove(0);
        for(int i=0; i<songList2.size(); i++) {
            System.out.println(songList2.get(i));
        }
        printSongList(lesMiz);
    }

    public static void printSongList(Show show) {
        for (int i=0; i<show.getSongs().size(); i++) {
            System.out.println(show.getSongs().get(i));
        }
    }

    public static void printCapacityList(Show show) {
        for (int i=0; i<show.getCapacityCounts().size(); i++) {
            System.out.println(show.getCapacityCounts().get(i));
        }
    }
}
