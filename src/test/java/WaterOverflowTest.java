import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class WaterOverflowTest {
    private Solution test = new Solution();

    @Test
    void verifyInvalidWaterCapacityCase1() {
        assertEquals(false, test.checkFloatInput("bad"));
    }

    @Test
    void verifyInvalidWaterCapacityCase2() {
        assertEquals(false, test.checkFloatInput("10bad"));
    }

    @Test
    void verifyValidWaterCapacityCase1() {
        assertEquals(true, test.checkFloatInput("10"));
    }

    @Test
    void verifyValidWaterCapacityCase2() {
        assertEquals(true, test.checkFloatInput("10.5"));
    }

    @Test
    void verifyInvalidRowInputCase1() {
        assertEquals(false, test.checkNumberInput("bad"));
    }

    @Test
    void verifyInvalidRowInputCase2() {
        assertEquals(false, test.checkNumberInput("2.5"));
    }

    @Test
    void verifyInvalidRowInputCase3() {
        assertEquals(false, test.checkNumberInput("1bad"));
    }

    @Test
    void verifyValidRowInputCase1() {
        assertEquals(true, test.checkNumberInput("2"));
    }

    @Test
    void verifyInvalidColumnInputCase1() {
        assertEquals(false, test.checkNumberInput("bad"));
    }

    @Test
    void verifyInvalidColumnInputCase2() {
        assertEquals(false, test.checkNumberInput("2.5"));
    }

    @Test
    void verifyInvalidColumnInputCase3() {
        //if column number greater than row number
        assertEquals(-1, test.findGlassCapacity(10,2,3));
    }

    @Test
    void verifyInvalidColumnInputCase4() {
        assertEquals(false, test.checkNumberInput("bad3"));
    }

    @Test
    void verifyValidColumnInputCase1() {
        assertEquals(true, test.checkNumberInput("2"));
    }

    @Test
    void verifyGlassCapacityNegativeCase1() {
        assertEquals(0.0, test.findGlassCapacity(1.5,2,2));
    }

    @Test
    void verifyGlassCapacityNegativeCase2() {
        assertEquals(0.0, test.findGlassCapacity(1.5,2,2));
    }

    @Test
    void verifyGlassCapacityPositiveCase1() {
        assertEquals(0.25, test.findGlassCapacity(1,1,1));
    }

    @Test
    void verifyGlassCapacityPositiveCase2() {
        assertEquals(0.25, test.findGlassCapacity(1.5,2,2));
    }
}
