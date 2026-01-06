import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CalculatorTest {

    @Test
    void testAddition(){
        Calculator calc = new Calculator();
        int result = calc.add(2,3);
        assertEquals(5,result,"2+3 should equal 5");
    }
    @Test
    void multiplyTest() {
        Calculator calculator = new Calculator();
        int res = calculator.multiply(2,3);
        assertEquals(6,res,"2*3 should be equal to 6");
    }
    @Test
    void multiplyTestNegative() {
        Calculator calculator = new Calculator();
        int res = calculator.multiply(2,3);
        assertNotEquals(6,res,"2*3 should be equal to 6");
    }
}
