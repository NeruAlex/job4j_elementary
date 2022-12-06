package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double i = h * k;
        double rsl = i * h;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(9, 3);
        System.out.println(" p = 9, k = 3, s = 2, real = " + result1);
    }
}