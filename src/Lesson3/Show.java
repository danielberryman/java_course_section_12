package Lesson3;

import java.util.ArrayList;
import java.util.List;

public class Show {
    private String name;
    private List<String> songs;
    private List<Integer> capacityCounts;

    public Show(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
        this.capacityCounts = new ArrayList<>();
    }

    public void add(String song) {
        this.songs.add(song);
    }

    public void addCount(Integer count) {
        this.capacityCounts.add(count);
    }

    public String getName() {
        return name;
    }

    public List<String> getSongs() {
        return songs;
    }

    public List<Integer> getCapacityCounts() {
        return capacityCounts;
    }
}
