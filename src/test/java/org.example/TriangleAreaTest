package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Description;

public class TriangleAreaTest {
    @Test
    @Description("Проверка вычисления площади треугольника с ненулевыми сторонами")
    public void testArea() {
        TriangleArea t = new TriangleArea();
        Assert.assertEquals(t.calculate(10, 5), 25.0);
    }

    @Test
    @Description("Проверка вычисления площади треугольника с нулевой стороной")
    public void testAreaWithZero() {
        TriangleArea t = new TriangleArea();
        Assert.assertEquals(t.calculate(0, 5), 0.0);
        Assert.assertEquals(t.calculate(10, 0), 0.0);
    }
} 
