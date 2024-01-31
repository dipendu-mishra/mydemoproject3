package MyTestPack1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import MyPack1.MyCalc;

public class TestMyCalc {
	
	
	
	@Test
	public void Test2()
	{
		MyCalc mc=new MyCalc();
		assertEquals(200,mc.mul(10,20));
		
	}
	
	@Test
	public void Test1()
	{
		MyCalc mc=new MyCalc();
		assertEquals(30,mc.sum(10,20));
		
	}

}
