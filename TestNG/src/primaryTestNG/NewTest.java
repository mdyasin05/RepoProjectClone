package primaryTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;

public class NewTest {
	
//	public String baseUrl = "https://www.google.com/";
//	public WebDriver driver = new FirefoxDriver;
	
    @BeforeTest
    public void test1(){
    	 
    	System.out.println("Test Started from ");
     }
	@Test
	public void Test1(){
      	int a=10;
      	int b=20;
      	int result=a+b;
      	System.out.println(result);
      	if (a<b)
      		System.out.println("the a value is "+a);
      	else 
      		System.out.println("value is wrong");
      	//int c=10;
      	for(int c1=0;c1<40;c1=c1+2) {
      		System.out.println(c1);
      	}
		
	}
	
     @Test
     public void Test2() {
	  int expecvalue= 25;
	  int Extuvaluue=25;
	  Assert.assertEquals(Extuvaluue, expecvalue);
	  Assert.assertTrue(true, "the condition is true");
	  Assert.assertEquals(true, true);
    }
    
     @Test
     public void Test3(){
    	 String Expval="The title is True";
    	 String Ectval="The title not specified";
    	 Assert.assertEquals(Ectval, Expval, "the value is wrong");
    	 Assert.fail(); 
     }
     @Test
     
     public void Test4(){
      String a [][]=new String[2][2];
      a[0][0]="Steave";
      a[0][1]="hocking";
      //a[1][0]="bahamas";
     // a[1][2]="cuba";

    	System.out.println(a[0][1]);
    	
       	 

  }
     
     

}
