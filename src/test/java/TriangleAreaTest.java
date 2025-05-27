import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleAreaTest {
    @Test
    public void testArea() {
        TriangleArea t = new TriangleArea();
        Assert.assertEquals(t.calculate(10, 5), 25.0);
    }

    @Test
    public void testAreaWithZero() {
        TriangleArea t = new TriangleArea();
        Assert.assertEquals(t.calculate(0, 5), 0.0);
        Assert.assertEquals(t.calculate(10, 0), 0.0);
    }
} 
