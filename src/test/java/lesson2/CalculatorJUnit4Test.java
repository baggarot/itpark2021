package lesson2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorJUnit4Test {

    @Test
    public void additionTest() {
        Assert.assertEquals(15, Calculator.addition(7,8));
    }

    @Test
    public void substractionTest() {
        Assert.assertEquals(4, Calculator.subtraction(13, 9));
    }

    @Test
    public void multiplicationTest() {
        Assert.assertEquals(35, Calculator.multiplication(7, 5));
    }

    @Test
    public void division() {
        Assert.assertEquals(9, Calculator.division(81, 9));
    }
}