
import main.hw3.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    // Тест - корректность четного числа:
    // ожидаем получить от метода evenOddNumber - true

    @Test
    void checkEvenNumber() {
        assertTrue(MainHW.evenOddNumber(4));
    }


    // Тест - корректность четного числа:
    // ожидаем получить от метода evenOddNumber - false

    @Test
    void checkOddNumber() {
        assertFalse(MainHW.evenOddNumber(3));
    }


}
