import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by frankegan on 4/8/16.
 */
public class QuickSort {
    /**
     * Sorts the given stream using recursive functional quicksort
     *
     * @param list The list you want sorted
     * @return A sorted stream of the given input
     */
    static Stream<Integer> sortInt(List<Integer> list) {
        //recursive base case
        if (list.isEmpty())
            return Stream.empty();
        //Use the first element of the stream as the pivot
        int pivot = list.stream().findFirst().get();
        return Stream.concat(
                Stream.concat(
                        sortInt(list
                                .stream()
                                .skip(1)
                                .filter(i -> i <= pivot)
                                .collect(Collectors.toList())),
                        Stream.of(pivot)),
                sortInt(list
                        .stream()
                        .skip(1)
                        .filter(i -> i > pivot)
                        .collect(Collectors.toList())));
    }

    /**
     * Sorts the given stream using recursive functional quicksort
     *
     * @param list The list you want sorted
     * @return A sorted stream of the given input
     */
    static Stream<Double> sortDouble(List<Double> list) {
        //recursive base case
        if (list.isEmpty())
            return Stream.empty();
        //Use the first element of the stream as the pivot
        double pivot = list.stream().findFirst().get();
        return Stream.concat(
                Stream.concat(
                        sortDouble(list
                                .stream()
                                .skip(1)
                                .filter(i -> i <= pivot)
                                .collect(Collectors.toList())),
                        Stream.of(pivot)),
                sortDouble(list
                        .stream()
                        .skip(1)
                        .filter(i -> i > pivot)
                        .collect(Collectors.toList())));
    }
}
