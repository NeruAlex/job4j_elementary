package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        for (int index = 0; index <= n; index++) {
            result = result * index;
            if (result == 0) {
                result = 1;
            }
        }
        return result;
        }

    public static void main(String[] args) {
        System.out.println(calc(5));
    }
}