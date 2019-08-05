package SolarSystem;

import java.util.HashSet;
import java.util.Set;

public final class SolarEntity {
    private final String name;
    private final double orbitalPeriod;
    private final Set<SolarEntity> satelittles;

    public SolarEntity(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satelittles = new HashSet<>();
    }

    public boolean addMoon(SolarEntity moon) {
        if (moon != null) {
            return this.satelittles.add(moon);
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<SolarEntity> getSatelittles() {
        return new HashSet<>(this.satelittles);
    }

    @Override
    public int hashCode() {
        System.out.println("Hashcode called");
        return this.name.hashCode() + 57;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        String objName = ((SolarEntity) obj).getName();
        return this.name.equals(objName);
    }
}
