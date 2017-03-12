package ngpak2;


import org.testng.annotations.Test;

public class TestNGCase2 {
	
	
 	@Test(timeOut=3000)        //       @Test 
	public void test1(){
		
		System.out.println("Test1");
		
	}
	
	
	@Test
	public void signup(){
		
		System.out.println("signup");
		
		
	}
	
	@Test(dependsOnMethods={"signup"},alwaysRun=true)
	public void signin(){
		
		System.out.println("signin");
		
		
	}


	
	@Test(enabled=false)
	public void test3(){
		
		System.out.println("Test3");
		
	}
	
	//@BeforeTest
	public void betest(){
		
		System.out.println("Before Test");

	}

	
	//@AfterTest
	public void afterTest(){
		
		System.out.println("After Test");
	}
	
	//@BeforeMethod
	public void bfmethod(){
		
		System.out.println("Before method");
     
		
	}
	
	//@AfterMethod
	public void aftest(){
		
		System.out.println("After Method ");
		
		
	}

}
