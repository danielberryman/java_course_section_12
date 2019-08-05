package SolarSystem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, SolarEntity> solarSystem = new HashMap<>();
    private static Set<SolarEntity> planets = new HashSet<>();

    public static void main(String[] args) {
        SolarEntity temp = new SolarEntity("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new SolarEntity("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new SolarEntity("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        SolarEntity tempMoon = new SolarEntity("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new SolarEntity("Jupiter", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new SolarEntity("Io", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        tempMoon = new SolarEntity("Europa", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        System.out.println("Planets:");
        for (SolarEntity planet : planets) {
            System.out.println("\t" + planet.getName());
        }

        Set<SolarEntity> moons = new HashSet<>();
        for(SolarEntity planet : planets) {
            moons.addAll(planet.getSatelittles());
        }
        System.out.println("All Moons");
        for (SolarEntity moon : moons) {
            System.out.println("\t" + moon.getName());
        }

        SolarEntity pluto = new SolarEntity("Pluto", 869.45);
        planets.add(pluto);
        temp = new SolarEntity("Jupiter", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        for(SolarEntity planet : planets) {
            System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
        }
    }
}
