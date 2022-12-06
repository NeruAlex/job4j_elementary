package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        double k = 2;
        int expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K3Square075() {
        double expected = 0.75;
        int p = 4;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void whenP7K2Square272() {
        double expected = 2.72;
        double p = 7;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void whenP9K3Square379() {
        double expected = 3.79;
        double p = 9;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(out, expected, 0.01);
    }
}