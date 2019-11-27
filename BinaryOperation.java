package 实验2;

import java.util.Random;

public class BinaryOperation {
	static final int UPPER = 100;
	static final int LOWER = 0;
	int left_operand = 0, right_operand = 0;
	char operator = '+';
	int value = 0;

	// 不是构造器
	public void construct(int left, int right, char op) {
		left_operand = left;
		right_operand = right;
		operator = op;
		if (op == '+') {
			value = left + right;
		} else {
			value = left - right;
		}
	}// 实际产生对象的三个方法

	public BinaryOperation generateAdditionOperation() {
		Random random = new Random();
		int left, right, result;
		left = random.nextInt(UPPER + 1);
		do {
			right = random.nextInt(UPPER + 1);
			result = left + right;
		} while (result > UPPER);
		BinaryOperation bop = new BinaryOperation();
		bop.construct(left, right, '+');
		return bop;
	}

	public BinaryOperation generateSubstractOperation() {
		// 减法
		Random random = new Random();
		int left, right, result;
		left = random.nextInt(UPPER + 1);
		do {
			right = random.nextInt(UPPER + 1);
			result = left + right;
		} while (result < LOWER);
		BinaryOperation bop = new BinaryOperation();
		bop.construct(left, right, '-');
		return bop;
	}

	public BinaryOperation generateBinaryOperation() {
		// 加减法
		Random random = new Random();
		int left, right, fh;
		fh = 0;
		left = random.nextInt(UPPER + 1);
		right = random.nextInt(UPPER + 1);
		fh = random.nextInt(2);
		BinaryOperation bop = new BinaryOperation();
		if (fh == 0) {
			bop.construct(left, right, '+');
		} else {
			bop.construct(left, right, '-');
		}
		return bop;
	}

	// 实例变量访问器
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

	public boolean equals(BinaryOperation anOperator) {
		return left_operand == anOperator.getLeftOperand()
				& right_operand == anOperator.getRightOperand()
				& operator == anOperator.getOperator();
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
}
