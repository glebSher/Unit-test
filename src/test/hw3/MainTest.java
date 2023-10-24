

import main.hw3.Task1;
import main.hw3.Task2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    // Тест - корректность четного числа:
    // ожидаем получить от метода evenOddNumber - true

    @Test
    void checkEvenNumber() {
        assertTrue(Task1.evenOddNumber(4));
    }


    // Тест - корректность четного числа:
    // ожидаем получить от метода evenOddNumber - false

    @Test
    void checkOddNumber() {
        assertFalse(Task1.evenOddNumber(3));
    }


    // Тестируем корректность нахождения числа в интервале (25;100)
    // ожидаем получить от метода numberInInterval - true

    @Test
    void checkNumberInInterval() {
        assertTrue(Task2.numberInInterval(25));
        assertTrue(Task2.numberInInterval(100));
    }


    // Тестируем корректность нахождения числа в интервале (25;100)
    // ожидаем получить от метода numberInInterval - false

    @Test
    void checkNumberNotInInterval() {
        assertFalse(Task2.numberInInterval(24));
        assertFalse(Task2.numberInInterval(101));
    }

}
