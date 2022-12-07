package ru.job4j.calculator;

public class MaxNumber {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int c = 9;
        int maxValue1 = Math.max(a, b);
        int maxValue2 = Math.max(b, c);
        int maxValueAll = Math.max(maxValue2, maxValue1);
        System.out.println(maxValueAll);
    }
}
