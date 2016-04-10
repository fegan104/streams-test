import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by frankegan on 4/8/16.
 */
public class SortTest{
    private final List<Integer> SORTED = Arrays.asList(1, 2, 3, 4, 5);
    @Test
    public void testReverseOrder() {
        List<Integer> l = Arrays.asList(5, 4, 3, 2, 1);
        Assert.assertTrue(
                QuickSort
                        .sortInt(l)
                        .collect(Collectors.toList())
                        .equals(SORTED));
    }

    @Test
    public void testInOrder() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        Assert.assertTrue(
                QuickSort
                        .sortInt(l)
                        .collect(Collectors.toList())
                        .equals(SORTED));
    }

    @Test
    public void testRandomOrder() {
        List<Integer> l = Arrays.asList(2, 4, 1, 5, 3);
        Assert.assertTrue(
                QuickSort
                        .sortInt(l)
                        .collect(Collectors.toList())
                        .equals(SORTED));
    }
}
