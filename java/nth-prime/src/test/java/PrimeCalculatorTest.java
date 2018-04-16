import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class PrimeCalculatorTest {
    private PrimeCalculator primeCalculator;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setup() {
        primeCalculator = new PrimeCalculator();
    }

    @Test
    public void testFirstPrime() {
        assertThat(primeCalculator.nth(1), is(2));
    }

    @Test
    public void testSecondPrime() {
        assertThat(primeCalculator.nth(2), is(3));
    }

    @Test
    public void testSixthPrime() {
        assertThat(primeCalculator.nth(6), is(13));
    }

    @Test
    public void testBigPrime() {
        assertThat(primeCalculator.nth(10001), is(104743));
    }

    @Test
    public void testUndefinedPrime() {
        expectedException.expect(IllegalArgumentException.class);
        primeCalculator.nth(0);
    }


    //My Tests

    @Test
    public void primeTest1(){
        assertTrue(primeCalculator.primes(3));
    }

    @Test
    public void primeTest2(){
        assertTrue(primeCalculator.primes(5));
    }

    @Test
    public void primeTest3(){
        assertTrue(primeCalculator.primes(11));
    }

    @Test
    public void primeTest4(){
        assertFalse(primeCalculator.primes(4));
    }

    @Test
    public void primeTest5(){
        assertFalse(primeCalculator.primes(10));
    }

    @Test
    public void primeTestZero(){
        assertFalse(primeCalculator.primes(0));
    }

    @Test
    public void primeTestOne(){
        assertFalse(primeCalculator.primes(1));
    }
}
