import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by frankegan on 4/8/16.
 */
public class Main {
    public static void main(String[] args) {
        List<Double> randList = Stream
                .generate(Math::random)
                .limit(10000)
                .collect(Collectors.toList());

        long startTime = System.currentTimeMillis();
        QuickSort.sortDouble(randList);
        long endTime = System.currentTimeMillis();
        System.out.println("Sorted in " + (endTime - startTime) + "ms");

        Fibonacci
                .generate(10)
                .forEach(System.out::println);
    }
}
