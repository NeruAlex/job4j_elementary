package ru.job4j.calculator.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double total = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
        return total;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("Result (0, 0) to (2, 0) " + result);
    }
}
