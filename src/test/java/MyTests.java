import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {

    @Test
    public void testProbabilityOneSix() {
        assertEquals(66.51, MyMain.probabilityOneSix(), 1.5, "The probability of rolling at least one 6 after rolling six dice should be around: 66.51%");
    }

    @Test
    public void testProbabilityTwoSixes() {
        assertEquals(61.87, MyMain.probabilityTwoSixes(), 1.5, "The probability of rolling at least two 6's after rolling twelve dice should be around: 61.87%");
    }

    @Test
    public void testProbabilityThreeSixes() {
        assertEquals(59.73, MyMain.probabilityThreeSixes(), 1.5, "The probability of rolling at least three 6;s after rolling eighteen dice should be around: 59.73%");
    }
    
}
