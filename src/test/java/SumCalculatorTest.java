import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {

    SumCalculator sumCalculator;

    @BeforeEach
    public void createInstance() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testInsertOfOne() {
        Assertions.assertEquals(sumCalculator.sum(1), 1);
    }

    @Test
    public void testInsertOfThree() {
        Assertions.assertEquals(sumCalculator.sum(3), 6);
    }

    @Test
    public void testInsetOfZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
           sumCalculator.sum(0);
        });
    }
}
