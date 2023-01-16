package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int  w = 0; w < width; w++) {
                if (w % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("Z");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
    }
}