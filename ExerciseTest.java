package ʵ��2;

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
		//fail("��δʵ��");
		exercise.generateBinaryExercise();
		System.out.println("test1:�ӷ������");
		System.out.println(exercise.operationList[1].asString()+"\n");
	}

	@Test
	public void testGenerateAdditionExercise() {
		//fail("��δʵ��");
		exercise.generateAdditionExercise();
		System.out.println("test2:�ӷ�");
		System.out.println(exercise.operationList[10].fullString()+"\n");
	}

	@Test
	public void testGenerateSubstractExercise() {
		//fail("��δʵ��");
		exercise.generateSubstractExercise();
		System.out.println("test3:����");
		System.out.println(exercise.operationList[5].toString()+"\n");
	}



}
