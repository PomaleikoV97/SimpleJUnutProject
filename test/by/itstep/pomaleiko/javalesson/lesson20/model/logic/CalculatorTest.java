package by.itstep.pomaleiko.javalesson.lesson20.model.logic;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        // Arrange
        int a = 10;
        int b = 2;
        int expected = 12;

        // Act
        int actual = Calculator.sum(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testSub() {
        // Arrange
        int a = 10;
        int b = 2;
        int expected = 8;

        // Act
        int actual = Calculator.sub(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testNul() {
        // Arrange
        int a = 10;
        int b = 2;
        int expected = 20;

        // Act
        int actual = Calculator.nul(a, b);

        // Assert
        if (expected != actual) {
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testDiv() {
        // Arrange
        int a = 10;
        int b = 2;
        int expected = 5;

        // Act
        int actual = Calculator.div(a, b);

        // Assert
        assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivByZero() {
        // Arrange
        int a = 10;
        int b = 0;
        Calculator.div(a, b);
    }
}
