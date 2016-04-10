import org.junit.Assert;
import org.junit.Test;

/**
 * Created by frankegan on 4/9/16.
 */
public class FibonacciTest {
    final Object[] BASE1 = {0};
    final Object[] BASE2 = {0, 1};
    final Object[] SEQUENCE_10 = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};

    @Test
    public void testBaseCase1() {
        Assert.assertArrayEquals(Fibonacci.generate(1).toArray(), BASE1);
    }

    @Test
    public void testBaseCase2() {
        Assert.assertArrayEquals(Fibonacci.generate(2).toArray(), BASE2);
    }

    @Test
    public void testSequence() {
        Assert.assertArrayEquals(Fibonacci.generate(10).toArray(), SEQUENCE_10);
    }

    @Test(expected = RuntimeException.class)
    public void testException() {
        Fibonacci.generate(0);
    }
}
