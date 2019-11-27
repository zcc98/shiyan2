package 实验2;
import java.util.Random;
public abstract class BinaryOperation_1_1 {
	static final int UPPER=100;
	static final int LOWER=0;
	private int left_operand=0,right_operand=0;
	private char operator='+';
	private int value=0;
	
	protected void generateBinaryOperation(char anOperator) {
	    int left, right, result;
	    Random random = new Random();
		left = random.nextInt(UPPER+1);
		do {
   			right = random.nextInt(UPPER+1);
			result = calculate(left,right);
		} while (!(checkingCalculation(result)));
		left_operand = left;
		right_operand = right;
		operator = anOperator;
		value = result;	
	}
	//子类必须实现的两个方法
	public abstract boolean checkingCalculation(int anInteger);
   public abstract int calculate(int left, int right);
    public int getLeftOperand() {
		return left_operand;
	}

	public int getRightOperand() {
		return right_operand;
	}

	public char getOperator() {
		return operator;
	}

	public int getResult() {
		return value;
	}
	
    public boolean equals (BinaryOperation_1_1 anOperation) {  // 要使用 getOperator()
		return 	left_operand == anOperation.getLeftOperand() &
				right_operand == anOperation.getRightOperand() &
				operator == anOperation.getOperator();
    }
    
    public String toString() {
		return "" + getLeftOperand() + getOperator() + getRightOperand();
	}

	public String asString() {
		return "" + getLeftOperand() + getOperator() + getRightOperand() + "=";
	}

	public String fullString() {
		return "" + getLeftOperand() + getOperator() + getRightOperand() + "="
				+ getResult();
	}
	
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
	class SubstractOperation extends BinaryOperation_1_1{
		public SubstractOperation() {
			generateBinaryOperation('-');
		}
		public boolean checkingCalculation(int anInteger){
			return anInteger>=LOWER;
		}
		public int calculate(int left,int right){
			return left-right;
		}
	}

}
