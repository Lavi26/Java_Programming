package armstrongnumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArmstrongNumberTest {

    @Test
    public void test() {
        assertEquals(true,ArmstrongNumber.calculate(407) );
        assertEquals(false,ArmstrongNumber.calculate(151));
        assertEquals(false,ArmstrongNumber.calculate(154));
    }
}