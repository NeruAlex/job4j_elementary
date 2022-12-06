package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02to10then223() {
        int x1 = 0;
        int y1 = 2;
        int x2 = 1;
        int y2 = 0;
        float expected = 2.23f;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void when20to30then1() {
        int x1 = 2;
        int y1 = 0;
        int x2 = 3;
        int y2 = 0;
        int expected = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void when20to03then360() {
        int x1 = 2;
        int y1 = 0;
        int x2 = 0;
        int y2 = 3;
        float expected = 3.60f;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(out, expected, 0.01);
    }
}