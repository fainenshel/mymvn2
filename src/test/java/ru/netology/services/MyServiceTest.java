package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MyServiceTest {

    @ParameterizedTest
    @CsvSource({
            "10000, 3000, 20000, 3",
            "100000, 60000, 150000, 2"
    })
    void calculate(int income, int expenses, int threshold, int expected) {
        MyService service = new MyService();
        int actual = service.calculate(income,
                expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}