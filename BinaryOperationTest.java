package 实验2;

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
		//fail("尚未实现");
		System.out.println("test1:加法");
		System.out.println(bop.generateAdditionOperation().asString()+"\n");
		System.out.println("test2:加减法");
		System.out.println(bop.generateBinaryOperation().fullString()+"\n");
		System.out.println("test3：减法");
		System.out.println(bop.generateSubstractOperation().toString()+"\n");
		
	}

	@Test
	public void testGetLeftOperand() {
		//fail("尚未实现");
		bop.construct(100, 50, '-');
		System.out.println("test4:得到左边的值");
		System.out.println(bop.getLeftOperand()+"\n");
	}

	

}
