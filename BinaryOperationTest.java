package ʵ��2;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;

public class BinaryOperationTest {
	BinaryOperation bop = new BinaryOperation();
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testGenerateAdditionOperation() {
		//fail("��δʵ��");
		System.out.println("test1:�ӷ�");
		System.out.println(bop.generateAdditionOperation().asString()+"\n");
		System.out.println("test2:�Ӽ���");
		System.out.println(bop.generateBinaryOperation().fullString()+"\n");
		System.out.println("test3������");
		System.out.println(bop.generateSubstractOperation().toString()+"\n");
		
	}

	@Test
	public void testGetLeftOperand() {
		//fail("��δʵ��");
		bop.construct(100, 50, '-');
		System.out.println("test4:�õ���ߵ�ֵ");
		System.out.println(bop.getLeftOperand()+"\n");
	}

	

}
