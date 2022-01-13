package ru.job4j.calculator.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double resultx = x2 - x1;
        double resultX2plusX1 = Math.pow(resultx, 2);
        double resulty = y2 - y1;
        double resultY2plusY1 = Math.pow(resulty, 2);
        double resultXplusY = resultX2plusX1 + resultY2plusY1;
        double total = Math.sqrt(resultXplusY);

        return total;

    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("Result (0, 0) to (2, 0) " + result);
    }
}
