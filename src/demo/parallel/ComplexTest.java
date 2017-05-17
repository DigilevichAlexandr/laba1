package demo.parallel;

import org.junit.Test;

import org.junit.Assert;

/**
 * Created by lenovo on 17.05.2017.
 */

public class ComplexTest {

    @Test
    public void testPlus()
    {
        Complex c1 = new Complex(0d,0d);
        Complex c2 = new Complex(2d,2d);

        Complex c3 = c1.plus(c2);

        Assert.assertEquals(c3.toString(),c2.toString());
    }

    @Test
    public void testTimes()
    {
        Complex c1 = new Complex(1d,0d);
        Complex c2 = new Complex(2d,2d);

        Complex c3 = c1.times(c2);

        Assert.assertEquals(c3.toString(),c2.toString());
    }
}
