package project1;
 
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class1 extends Baseclass {


		@Test(groups="Smoke")
		public void testCase1()  {
			System.out.println(" ****** Test Case 1 ***** ");
		}
		@Test(groups="Regression")
		public void testCase2() {
			System.out.println(" ****** Test Case 2 ***** ");
		}
		

		 
	

}
