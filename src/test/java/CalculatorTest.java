import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        Assert.assertEquals(c.add(2, 3), 5);
    }

    @Test
    public void testSubtract() {
        Calculator c = new Calculator();
        Assert.assertEquals(c.subtract(5, 3), 2);
    }

    @Test
    public void testMultiply() {
        Calculator c = new Calculator();
        Assert.assertEquals(c.multiply(4, 3), 12);
    }

    @Test
    public void testDivide() {
        Calculator c = new Calculator();
        Assert.assertEquals(c.divide(10, 2), 5);
    }
} 
