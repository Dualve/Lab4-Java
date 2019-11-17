package by.bntu.fitr.povt.balkis.lab4.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class LogicTest {

    @Test
    public void countingDays() {
        Counter logic = new Counter();
        assertEquals(6894, logic.countingDays(14,12,2000));
    }
}