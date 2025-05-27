import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {
    @Test
    public void testFactorialOfZero() {
        Factorial f = new Factorial();
        Assert.assertEquals(f.calculate(0), 1);
    }

    @Test
    public void testFactorialOfOne() {
        Factorial f = new Factorial();
        Assert.assertEquals(f.calculate(1), 1);
    }

    @Test
    public void testFactorialOfFive() {
        Factorial f = new Factorial();
        Assert.assertEquals(f.calculate(5), 120);
    }
} 
