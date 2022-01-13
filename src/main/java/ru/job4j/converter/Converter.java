package ru.job4j.converter;

public class Converter {
    public static float rubToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float euroToRub(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static float rubToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static float dollarToRub(float value) {
        float result = value * 60;
        return result;
    }

    public static void main(String[] args) {
        float eurorub = Converter.rubToEuro(770);
        float dollarrub = Converter.rubToDollar(1200);
        System.out.println("770 rub are " + eurorub + " euro");
        System.out.println("1200 rub are " + dollarrub + " euro");
        float rubeuro = Converter.euroToRub(15);
        float rubdollar = Converter.dollarToRub(22);
        System.out.println("15 euro are " + rubeuro + " rub");
        System.out.println("22 dollar are " + rubdollar + " rub");
    }
}
