package by.bntu.fitr.povt.dubodelov.lab5.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void testSumOfNum(){
        int num = 1234;
        int expected = 10;
        int actual = Counter.sumOfNum(num);
        Assert.assertEquals(expected, actual);
    }

}
