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
    public void whenP4K3Square0dot75() {
        float expected = 0.75f;
        int p = 4;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void whenP7K2Square2dot72() {
        float expected = 2.72f;
        double p = 7;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void whenP9K3Square3dot79() {
        float expected = 3.79f;
        double p = 9;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(out, expected, 0.01);
    }
}