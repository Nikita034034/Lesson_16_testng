import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleAreaTest {
    @Test
    public void testAreaWithZero() {
        TriangleArea t = new TriangleArea();
        assertEquals(0.0, t.calculate(0, 10));
    }

    @Test
    public void testAreaWithPositiveNumbers() {
        TriangleArea t = new TriangleArea();
        assertEquals(6.0, t.calculate(3, 4));
    }

    @Test
    public void testAreaWithDoubles() {
        TriangleArea t = new TriangleArea();
        assertEquals(2.5, t.calculate(2.0, 2.5));
    }
} 
