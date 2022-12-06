package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(210);
        float ineuro = 210;
        float expected = 3;
        float outeuro = Converter.rubleToEuro(ineuro);
        boolean passed = expected == outeuro;
        System.out.println("210 rubles are " + euro + " euro. Test:" + passed);
        float dollars = Converter.rubleToDollar(240);
        float indollars = 240;
        float expecteddollars = 4;
        float outdollars = Converter.rubleToDollar(indollars);
        boolean passeddollars = expecteddollars == outdollars;
        System.out.println("240 rubles are " + dollars + " dollars. Test:" + passeddollars);
    }
}