package primaryTestNG;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTest1 {
    public WebDriver driver; 
    
    @BeforeTest
    public void Test1(){
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\tmcon\\workspace\\jar file\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
    	driver.get("http://www.macys.com/");
    }
   @BeforeMethod
   public void mat(){
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
   }
    @Test
    public void test2(){
    	WebElement stor=driver.findElement(By.xpath(".//*[@id='flexLabel_669']/a"));
    	Actions name=new Actions(driver);
    	name.moveToElement(stor).build();
    	driver.findElement(By.xpath(".//*[@id='flexLabel_669']/a")).click();
    	//driver.findElement(By.xpath(".//*[@id='flexLabel_30521']/a")).click();
    	
    	if(stor.equals("Face"))
    		System.out.println("the value is exist");
    }
    @Test
    public void test3(){
    	WebElement name2=driver.findElement(By.xpath(".//*[@id='globalMastheadCategoryMenu']"));
    	List<WebElement>link=name2.findElements(By.tagName("a"));
    	System.out.println(link.size());
    	
    	for(int i=0;i<link.size();i++){
    		System.out.println(link.get(i).getText());
    		
    		
  
    		if(link.equals("BRANDS"))
    			System.out.println("The Value  set to deployed");
    		
    	}

    	
    }
    	
    	
    
    
    
    
    }
		
	
		

