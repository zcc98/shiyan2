package ʵ��2;

class SubstractOperation extends BinaryOperation_1_1{
	public SubstractOperation() {
		generateBinaryOperation('+');
	}
	public boolean checkingCalculation(int anInteger){
		return anInteger>=LOWER;
	}
	public int calculate(int left,int right){
		return left-right;
	}
	
}
