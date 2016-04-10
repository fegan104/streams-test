import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by frankegan on 4/9/16.
 */
public class Fibonacci {
    /**
     * Generates a {@link Stream} of fibonacci numbers for the first n members.
     *
     * @param n Specifies how many elements should be returned
     * @return A stream contains n elements from the fibonacci sequence
     */
    public static Stream<Integer> generate(int n) {
        if (n <= 0)
            throw new RuntimeException("generate called with a non natural number");
        if (n == 1)
            return Stream.of(0);
        else if (n == 2)
            return Stream.concat(Stream.of(0), Stream.of(1));
        else {
            List<Integer> list = generate(n - 1).collect(Collectors.toList());
            return Stream.concat(list.stream(),
                    Stream.of(list
                            .stream()
                            .skip(n - 2)
                            .findFirst()
                            .get() + list
                            .stream()
                            .skip(n - 3)
                            .findFirst()
                            .get()));
        }
    }
}
