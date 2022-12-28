package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        int number = switch (name) {
                case "Понедельник" -> 1;
                case "Вторник" -> 2;
                case "Среда" -> 3;
                case "Четверг" -> 4;
                case "Пятница" -> 5;
                case "Суббота" -> 6;
                case "Воскресенье" -> 7;
                default -> 0;
        };
        return number;
    }

    public static void main(String[] args) {
        System.out.println(numberOfDay("Вторник"));
    }
}