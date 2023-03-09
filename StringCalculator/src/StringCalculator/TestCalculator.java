package StringCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculator {
	@Test
    public void testAddEmptyString() {
		StringCalculator calculator = new StringCalculator();
        int result = calculator.add("");
        assertEquals(0, result);
    }

	@Test
    public void testAddSingleNumber() {
		StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1");
        assertEquals(1, result);
    }

	@Test
    public void testAddTwoNumbers() {
		StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1,2");
        assertEquals(3, result);
    }

	@Test
    public void testAddUnknownNumberOfNumbers() {
		StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1,2,3,4,5");
        assertEquals(15, result);
    }

	@Test
    public void testAddNewLinesBetweenNumbers() {
		StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1\n2,3");
        assertEquals(6, result);
    }

	@Test
    public void testAddDifferentDelimiter() {
		StringCalculator calculator = new StringCalculator();
        int result = calculator.add("//;\n1;2");
        assertEquals(3, result);
    }

	@Test(expected = IllegalArgumentException.class)
    public void testAddNegativeNumbers() {
		StringCalculator calculator = new StringCalculator();
        calculator.add("-1,2,-3");
    }

	@Test
    public void testAddNumbersGreaterThan1000() {
		StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1001,2");
        assertEquals(2, result);
    }

	@Test
    public void testAddDelimitersOfAnyLength() {
		StringCalculator calculator = new StringCalculator();
        int result = calculator.add("//[|||]\n1|||2|||3");
        assertEquals(6, result);
    }

	@Test
    public void testAddMultipleDelimiters() {
    	trial_4 calculator = new trial_4();
        int result = calculator.add("//[|][%]\n1|2%3");
        assertEquals(6, result);
    }

}
