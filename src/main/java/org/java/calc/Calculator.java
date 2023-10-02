package org.java.calc;


public class Calculator {
	
	private float numb1;
	private float numb2;
	
	public Calculator(float numb1, float numb2) throws Exception {
		
		setNumb1(numb1);
		setNumb2(numb2);
	}
	
	public float getNumb1() {
		return numb1;
	}

	public void setNumb1(float numb1) {
		this.numb1 = numb1;
	}

	public float getNumb2() {
		return numb2;
	}

	public void setNumb2(float numb2) {
		this.numb2 = numb2;
	}

	
		
		
		
		public float addNumbers(float numb1, float numb2) {
			return (numb1 + numb2);
		}
		
		public float subtractNumbers(float numb1, float numb2) {
			return (numb1 - numb2);
		}
		
		public float divideNumbers(float numb1, float numb2) {
			return (numb1 / numb2);
		}
		
		public float multiplyNumbers(float numb1, float numb2) {
			return (numb1 * numb2);
		}
	
		
	
	
	
	
	
}
