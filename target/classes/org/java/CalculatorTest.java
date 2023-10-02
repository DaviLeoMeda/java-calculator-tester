package org.java.calc;

public class CalculatorTest {

	static Calculator c1 = null;
	
	static final float numb1 = 5f;
	static final float numb2 = 9.2f;
	
	@BeforeAll
	
	public static voit init() {
		calc1 = new Calculator();
	}
	
	@Test
	public void testAdding() {
		
		float res = 15;
		
		float testRes = calc1.addNumbers(numb1, numb2);
		
		assertEquals (res, testRes);
	}
}
