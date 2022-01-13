package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightman = 177;
        double man = Fit.manWeight(heightman);
        short heightwoman = 165;
        double woman = Fit.womanWeight(heightwoman);
        System.out.println("Man 177 is " + man + " kg");
        System.out.println("Woman 165 is " + woman + " kg");
    }

}
