package primaryTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGCase1 {
	
	@BeforeTest 
	public void test0(){
		
		System.out.println("");
	}
	
	
	@Test
	public void test1(){
		
		System.out.println("First Test ");
		
	}
	
	
	@Test
	public void test2(){
		
		System.out.println("second  Test ");
		
	}

	
	@Test
	public void test3(){
		
		System.out.println("3 Test ");
		
	}
	
	@BeforeTest
	public void betest(){
		
		System.out.println("Before all Test");
	}

	
	@AfterTest
	public void afterTest(){
		
		System.out.println("After Test");
	}
	
	@BeforeMethod
	public void bfmethod(){
		
		System.out.println("Before every test");
	}
	
	@AfterMethod
	public void aftest(){
		
		System.out.println("After every Test");
	}

}
