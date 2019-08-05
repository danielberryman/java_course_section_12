package Adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("w", 2);
        locations.get(1).addExit("e", 3);
        locations.get(1).addExit("s", 4);
        locations.get(1).addExit("n", 5);

        locations.get(2).addExit("n", 5);

        locations.get(3).addExit("w", 1);

        locations.get(4).addExit("n", 1);
        locations.get(4).addExit("w", 2);

        locations.get(5).addExit("s", 1);
        locations.get(5).addExit("w", 2);

        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("AVAILABLE EXITS ARE ");
            for(String exit: exits.keySet()) {
                System.out.println(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toLowerCase();
            String[] directionArr = direction.split(" ");

            for (String str: directionArr) {
                System.out.println(str);
                switch (str) {
                    case "north":
                        direction = "n";
                        break;
                    case "south":
                        direction = "s";
                        break;
                    case "east":
                        direction = "e";
                        break;
                    case "west":
                        direction = "w";
                        break;
                    default:
                        direction = direction;

                }

            }

            if(exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
