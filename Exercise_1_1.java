package 实验2;

import java.util.Random;

import javax.annotation.Generated;


public class Exercise_1_1 extends Exercise {
	public void generateBinaryExercise(int operationCount){
		BinaryOperation_1_1 anOperation;
		while(operationCount>0){
		do{anOperation=generateOperation();
			}while(contains(anOperation));
			operationCount--;
		}
	}
	private BinaryOperation_1_1 generateOperation(){
		Random random=new Random();
		int fh=random.nextInt(2);
		if(fh==1){
			return new AdditionOperation();
		}
		return new SubstractOperation();
	}
	
	public BinaryOperation_1_1 generateAdditionExercise(int operationCount){
		return new AdditionOperation();
	}
	
	public BinaryOperation_1_1 generateSubstractExercise(int operationCount){
		return new SubstractOperation();
	}
	public void formattedDisplay(int columns){
		for (int i = 0; i < OPERATION_number;) {
			System.out.print("第" + (i + 1) + "题:" + operationList[i].asString());
			i++;
			if (i % columns == 0) {
				System.out.println();
			}

		}
	}
	
}