package 实验2;

public class ExerciseSheet_1_1{
	private static final short COLUMN_NUMBER=5;
	public void formattedDisplay (Exercise_1_2 ex, int columns){
		while(ex.hasNext()){
				ex.next();
		}	
	}
	public void formattedDisplay(Exercise_1_2 ex){
		formattedDisplay(ex, COLUMN_NUMBER);
	}
	private static void print(String str){
		System.out.println(str);
	}
	//一次应用
	public static void main(String[] args){
		ExerciseSheet_1_1 sheet=new ExerciseSheet_1_1();
		Exercise_1_2 exercise=new Exercise_1_2();
		exercise.generateAdditionExercise(28);
		System.out.println("---- generate and display add exercises ----");
		sheet.formattedDisplay(exercise,4);
	}
}
