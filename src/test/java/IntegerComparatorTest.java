import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegerComparatorTest {
    @Test
    public void testCompareLess() {
        IntegerComparator ic = new IntegerComparator();
        Assert.assertEquals(ic.compare(1, 2), -1);
    }

    @Test
    public void testCompareGreater() {
        IntegerComparator ic = new IntegerComparator();
        Assert.assertEquals(ic.compare(3, 2), 1);
    }

    @Test
    public void testCompareEqual() {
        IntegerComparator ic = new IntegerComparator();
        Assert.assertEquals(ic.compare(2, 2), 0);
    }
} 
