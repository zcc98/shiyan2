package 实验2;

import java.util.ArrayList;
import java.util.Random;

public class Exercise_1_2 {
	private ArrayList<BinaryOperation_1_1> operationList = new ArrayList<BinaryOperation_1_1>();
	private int current=0;
	
	public void generateAdditionExercise(int operationCount){
		BinaryOperation_1_1 anOperation;
		while (operationCount > 0 ){
			do {anOperation = new AdditionOperation();
			}while (operationList.contains(anOperation));
			operationList.add(anOperation);
			// System.out.println("count="+ operationList.size());
			operationCount--;
		}
	}
	public void generateSubstractExercise(int operationCount){
		BinaryOperation_1_1 anOperation;
		while (operationCount > 0 ){
			do{anOperation = new SubstractOperation();
			}while (operationList.contains(anOperation));
			operationList.add(anOperation);
			operationCount--;
		}
	}
	public void generateBinaryExercise(int operationCount){
		BinaryOperation_1_1 anOperation;
		while (operationCount > 0 ){
			do{anOperation = generateOperation();
			}while (operationList.contains(anOperation));
			operationList.add(anOperation);
			operationCount--;
		}
	}
	private BinaryOperation_1_1 generateOperation(){
		Random random = new Random();
		int opValue = random.nextInt(2);
		if (opValue == 1){ 
			return new AdditionOperation();
		}
		return new SubstractOperation();
	}
	
	//下面两个方法实现遍历
	public boolean hasNext(){
		return current<=operationList.size()-1;
	}
	public BinaryOperation_1_1 next(){
		return operationList.get(current++);
	}
}
