import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by frankegan on 4/8/16.
 */
public class Main {
    static List<Double> randList = Stream
            .generate(Math::random)
            .limit(10000)
            .collect(Collectors.toList());

    public static void main(String[] args) {
        sortTimer(randList);

        Fibonacci
                .generate(10)
                .forEach(System.out::println);
    }

    /**
     * A utility method for timing teh sorting a list.
     * @param list The list to be timed adn sorted
     */
    public static void sortTimer(List list) {
        long startTime = System.currentTimeMillis();
        QuickSort.sortDouble(list);
        long endTime = System.currentTimeMillis();
        System.out.println("Sorted in " + (endTime - startTime) + "ms");
    }
}
