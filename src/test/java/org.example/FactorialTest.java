package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Description;

public class FactorialTest {
    @Test
    @Description("Проверка факториала числа 0")
    public void testFactorialOfZero() {
        Factorial f = new Factorial();
        Assert.assertEquals(f.calculate(0), 1);
    }

    @Test
    @Description("Проверка факториала числа 1")
    public void testFactorialOfOne() {
        Factorial f = new Factorial();
        Assert.assertEquals(f.calculate(1), 1);
    }

    @Test
    @Description("Проверка факториала числа 5")
    public void testFactorialOfFive() {
        Factorial f = new Factorial();
        Assert.assertEquals(f.calculate(5), 120);
    }
} 
