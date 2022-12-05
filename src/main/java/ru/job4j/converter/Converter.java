package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(525);
        System.out.println("525 rubles are " + euro + " euro.");
        float dollars = Converter.rubleToDollar(850);
        System.out.println("850 rubles are " + dollars + " dollars");
    }
}