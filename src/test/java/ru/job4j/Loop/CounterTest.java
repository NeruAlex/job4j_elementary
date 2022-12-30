package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromSixtenToFiftyThenSixHundredThirty() {
        int start = 10;
        int finish = 50;
        int result = Counter.sumByEven(start, finish);
        int expected = 630;
        assertThat(result).isEqualTo(expected);
    }
}