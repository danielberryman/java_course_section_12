package Lesson2;

public class Car implements Comparable<Car> {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Car car) {
        return this.getName().compareTo(car.getName());
    }

    public String getName() {
        return name;
    }
}
