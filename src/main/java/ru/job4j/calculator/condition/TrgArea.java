package ru.job4j.calculator.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double rsl = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
