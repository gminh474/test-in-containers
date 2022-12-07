import org.junit.jupiter.api.Test;
 
import static org.junit.jupiter.api.Assertions.*;
 
class CalculatorTest {
 
        @Test
        void AddTwoNumbers() {
            Calculator calc = new Calculator();
            int result = calc.add(1,1);
            assertEquals(2, result);
        }
 
        @Test
        void AddNegativeNumbers() {
            Calculator calc = new Calculator();
            int result = calc.add(-1,-1);
            assertEquals(-2, result);
        }
 
        @Test
        void AddZeroToANumber(){
            Calculator calc = new Calculator();
            int result = calc.add(1,0);
            assertEquals(1, result);
        }
}
