package 实验2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExerciseTest {
	Exercise exercise=new Exercise();
	BinaryOperation bop=new BinaryOperation();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGenerateBinaryExercise() {
		//fail("尚未实现");
		exercise.generateBinaryExercise();
		System.out.println("test1:加法或减法");
		System.out.println(exercise.operationList[1].asString()+"\n");
	}

	@Test
	public void testGenerateAdditionExercise() {
		//fail("尚未实现");
		exercise.generateAdditionExercise();
		System.out.println("test2:加法");
		System.out.println(exercise.operationList[10].fullString()+"\n");
	}

	@Test
	public void testGenerateSubstractExercise() {
		//fail("尚未实现");
		exercise.generateSubstractExercise();
		System.out.println("test3:减法");
		System.out.println(exercise.operationList[5].toString()+"\n");
	}



}
