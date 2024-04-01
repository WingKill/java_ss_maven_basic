package edu.sejong.ex;

/**
 * Hello world!
 *
 */
public class Calculator{
    private int firstNum;
    private int secondNum;
    
    public Calculator() {
		
	}
    
    public void addition() {
    	System.out.println("addition()..");
    	int result = this.firstNum + this.secondNum;
    	System.out.println(firstNum + " + " + secondNum + " = " + result);
    }
    
    public void subtraction() {
    	System.out.println("subtraction()..");
    	int result = this.firstNum - this.secondNum;
    	System.out.println(firstNum + " - " + secondNum + " = " + result);
    }

	public void multiplication () {
		System.out.println("multiplication ()..");
		int result = this.firstNum * this.secondNum;
		System.out.println(firstNum + " x " + secondNum + " = " + result);
	}
	
	public void division () {
		System.out.println("division ()..");
		int result = this.firstNum / this.secondNum;
		System.out.println(firstNum + " / " + secondNum + " = " + result);
	}
	
	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	} 
}
