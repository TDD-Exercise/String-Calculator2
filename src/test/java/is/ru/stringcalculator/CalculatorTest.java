package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEmptyString() throws Exeption{
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber()throws Exeption{
		assertEquals(1, Calculator.add("1"));
	}
	@Test
	public void testTwoNumbers()throws Exeption{
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testMultipleNumbers()throws Exeption{
		assertEquals(6, Calculator.add("1,2,3"));
	}

	@Test
	public void test3NumbersWitNewLine()throws Exeption{
		assertEquals(6, Calculator.add("1\n2,3"));
	}
@Test
	public void testTwoNumbersNewline()throws Exeption{
		assertEquals(3, Calculator.add("1\n2"));
	}

	@Test
	public void testDiffrDelimiter()throws Exeption{
		assertEquals(3, Calculator.add("//;\n1;2"));
	}

	@Test
	public void testNegitiveNumber()throws Exeption{
		assertEquals(3, Calculator.add("-1"));
	}

	@Test
	public void testIgnorBigger()throws Exeption{
		assertEquals(30, Calculator.add("10,20,1001"));
	}
}
