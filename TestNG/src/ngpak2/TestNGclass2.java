package ngpak2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGclass2 {
	
	@Test
	public void ngmethod2(){
		
		System.out.println("NGmethod 2");
	}
	
	
	@BeforeSuite
	public void beforesuit(){
		
		System.out.println("Mata nosto");
	}
	
	@AfterSuite
	public void aftersuit(){
		
		System.out.println("Aftersuit");
	}

}
