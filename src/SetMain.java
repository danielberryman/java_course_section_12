import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i=1; i<=100; i++) {
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);

        System.out.println("union contains " + union.size() + " elements");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");
        for (int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.sqrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrWords));

        for(String s : words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();

        nature.add("Hello");

        String[] natureWords = {"all", "nature", "is", "to", "but"};
        nature.addAll(Arrays.asList(natureWords));
        System.out.println("Nature set:");
        printSet(nature);

        String[] divineWords = {"to", "err", "is", "human", "to", "forgive"};
        divine.addAll(Arrays.asList(divineWords));
        System.out.println("Divine set:");
        printSet(divine);

        System.out.println("Asymmetric differences:");
        System.out.println("nature - divine:");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine - nature:");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);

        Set<String> union2 = new HashSet<>(nature);
        union2.addAll(divine);
        Set<String> intersection2 = new HashSet<>(nature);
        intersection2.retainAll(divine);

        System.out.println("Symmetric Difference:");
        union2.removeAll(intersection2);
        printSet(union2);

    }

    private static void printSet(Set<String> set) {
        System.out.println("\t");
        for(String s: set) {
            System.out.println(s + " ");
        }
        System.out.println();
    }
}
