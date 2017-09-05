package com.codingdojo.calculator2;

public class Calculator2  {
//	declare two operands, two operators, and a total; also declare booleans for if they contain something
	private double operand1;
	private double operand2;
	private String operator1;
	private String operator2;
	private double total;
	private boolean operand1Set = false;
	private boolean operand2Set = false;
	private boolean operator1Set = false;
	private boolean operator2Set = false;
	private boolean totalSet = false;
	
	public Calculator2() {
	}
	
	public void performOperation(double operand) {
		if(!this.operand1Set) {
			this.operand1 = operand;
			this.operand1Set = true;
		} else if(operator1Set && !operand2Set) {
			if(this.operator1 == "*") {
				this.operand1 = this.operand1*operand;
				this.operator1Set = false;
			} else if(this.operator1 == "/") {
				this.operand1 = this.operand1/operand;
				this.operator1Set = false;
			} else {
				this.operand2 = operand;
				this.operand2Set = true;
			}
		} else if(operator1Set && operand2Set && operator2Set) {
			if(this.operator2 == "*") {
				this.operand2 = this.operand2*operand;
				this.operator2Set = false;
			} else if(this.operator2 == "/") {
				this.operand2 = this.operand2/operand;
				this.operator2Set = false;
			} else {
				if(this.operator1 == "+") {
					this.operand1 += this.operand2;
				} else {
					this.operand1 -= this.operand2;
				}
				this.operator1 = this.operator2;
				this.operator2Set = false;
				this.operand2 = operand;
			}
		} else {
			throw new IllegalThreadStateException();
		}
	}
	public void performOperation(String operator) {
		if(operator == "=") {
			if(this.operator1 == "+") {
				this.total = this.operand1 + this.operand2;
			} else {
				this.total = this.operand1 - this.operand2;
			}
			totalSet = true;
		} else if(operator == "*" || operator == "/" || operator == "+" || operator == "-") {
			totalSet = false;
			if(this.operand1Set && !this.operator1Set) {
				this.operator1 = operator;
				this.operator1Set = true;
			} else if(this.operand1Set && this.operator1Set && this.operand2Set && !this.operator2Set) {
				this.operator2 = operator;
				this.operator2Set = true;
			} else {
				throw new IllegalThreadStateException();
			}
		} else {
			throw new UnsupportedOperationException();
		}
	}
	public void getResults() {
		if(totalSet == true) {
			System.out.println(this.total);
		} else {
			throw new IllegalThreadStateException();
		}
	}
}
