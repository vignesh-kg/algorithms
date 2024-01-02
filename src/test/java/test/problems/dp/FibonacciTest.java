package test.problems.dp;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import problems.dp.Fibonacci;

public class FibonacciTest
{
    @Test
    public void memoizationTest()
    {
        Fibonacci fb = new Fibonacci();
        int[] fibonacciSeries = fb.memoizationApproach(10);
        int[] expectedSeries = {0,1,1,2,3,5,8,13,21,34};
        assertArrayEquals(expectedSeries,fibonacciSeries);
    }

    @Test
    public void tabulationTest()
    {
        Fibonacci fb = new Fibonacci();
        int[] fibonacciSeries = fb.tabulationApproach(10);
        int[] expectedSeries = {0,1,1,2,3,5,8,13,21,34};
        assertArrayEquals(expectedSeries,fibonacciSeries);
    }
}