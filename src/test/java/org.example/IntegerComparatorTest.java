package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Description;

public class IntegerComparatorTest {
    @Test
    @Description("Проверка сравнения: первое число меньше второго")
    public void testCompareLess() {
        IntegerComparator ic = new IntegerComparator();
        Assert.assertEquals(ic.compare(1, 2), -1);
    }

    @Test
    @Description("Проверка сравнения: первое число больше второго")
    public void testCompareGreater() {
        IntegerComparator ic = new IntegerComparator();
        Assert.assertEquals(ic.compare(3, 2), 1);
    }

    @Test
    @Description("Проверка сравнения: числа равны")
    public void testCompareEqual() {
        IntegerComparator ic = new IntegerComparator();
        Assert.assertEquals(ic.compare(2, 2), 0);
    }
} 
