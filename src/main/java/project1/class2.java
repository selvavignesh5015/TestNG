package project1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class2 {

	// @Test(groups ="Smoke")


	// @Test(groups="Regression")
	
	@Test
	public void A() {
		System.out.println("A");
	}
	
	@Test
	public void B() {
		System.out.println("B");
	}

	@Test
	public void E() {
		System.out.println("E");
	}

	@Test
	public void D() {
		System.out.println("D");
	}

	@Test(dependsOnMethods = "A")
	public void C() {
		System.out.println("C");
	}
	

	
	
	@Test
	public void F() {
		System.out.println("F");
	}
	
	

//	@BeforeTest
//	public void hjhv() {
//		System.out.println("fubvkj");
//	}

}
