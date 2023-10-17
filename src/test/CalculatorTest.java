import main.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {
    @Test
    public void additionShouldCorrect() {
        int result = 6;
        int resultTest = Calculator.calculation(3, 3, '+');
        assertEquals(result, resultTest, "Некорректное сложение");
    }


    // Утверждение на вычитание

    @Test
    public void differenceShouldCorrect() {
        int result = 3;
        int resultTest = Calculator.calculation(6, 3, '-');
        assertEquals(result, resultTest, "Некорректное вычитание");
    }


    // Утверждение на умножение

    @Test
    public void multiplicationShouldCorrect() {
        int result = 8;
        int resultTest = Calculator.calculation(4, 2, '*');
        assertEquals(result, resultTest, "Некорректное умножение");
    }


    // Утверждение на деление

    @Test
    public void divisionShouldCorrect() {
        int result = 6;
        int resultTest = Calculator.calculation(18, 3, '/');
        assertEquals(result, resultTest, "Некорректное деление");
    }


    // Извлечение корня целого числа

    @Test
    public void rootIntegerShouldExtracted() {
        double result = 5.0;
        double resultTest = Calculator.squareRootExtraction(25.0);
        assertEquals(result, resultTest, "Корень целого числа извлечен некорректно");
    }


    // Утверждение расчета суммы покупки с применением скидки

    @Test
    public void calculatingDiscountShouldCorrect() {
        double result = 4500.0;
        double resultTest = Calculator.calculatingDiscount(5000, 10);
        assertEquals(result, resultTest, "Некорректное вычисление скидки");
    }


    // Исключение деления на ноль

    @Test
    public void checkDivisionByZero() {
        String message = "Division by zero is not possible";
        Exception exception = assertThrows(ArithmeticException.class, () ->
                Calculator.calculation(5, 0, '/'));
        assertEquals(message, exception.getMessage());
    }


    // Исключение некорректного оператора

    @Test
    public void checkInvalidOperator() {
        String message = "Unexpected value operator: _";
        Exception exception = assertThrows(IllegalStateException.class, () ->
                Calculator.calculation(9, 3, '_'));
        assertEquals(message, exception.getMessage());
    }


    // Исключение: извлечение корня из отрицательного числа

    @Test
    public void checkTakingRootNegativeNumber() {
        String message = "Cannot calculate square root of a negative number";
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                Calculator.squareRootExtraction(-0.1));
        assertEquals(message, exception.getMessage());
    }

    // Исключение: сумма покупки меньше 1RUR

    @Test
    public void purchaseAmountCannotLessOne() {
        String messageException = "Сумма покупки не может быть меньше 1RUR";
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                Calculator.calculatingDiscount(0, 10));
        assertEquals(messageException, exception.getMessage());
    }


    // Исключение: размер скидки меньше нуля

    @Test
    public void discountAmountCannotLessZero() {
        String message = "Процент скидки не может быть отрицательным";
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                Calculator.calculatingDiscount(100, -5));
        assertEquals(message, exception.getMessage());
    }
}
