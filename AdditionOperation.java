package สตั้2;

class AdditionOperation extends BinaryOperation_1_1{
	public AdditionOperation() {
		generateBinaryOperation('+');
	}
	public boolean checkingCalculation(int anInteger){
		return anInteger<=UPPER;
	}
	public int calculate(int left,int right){
		return left+right;
	}

}