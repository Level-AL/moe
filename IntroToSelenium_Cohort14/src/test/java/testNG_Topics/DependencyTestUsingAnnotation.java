package testNG_Topics;

import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation {

	
	@Test(dependsOnMethods ={"method2","method1","aaa"})
	public void dashboardCheck() {
		
		System.out.println("Dashboard is displayed and there are some assertions here");
		
	}
	
	@Test
	public void method1() {
		
		
		System.out.println("method1");
	}
	@Test
	public void method2() {
		
		
		System.out.println("method2");
	}
	
	
	@Test
	public void aaa() {
		
		
		System.out.println("aaaaaa");
	}
	
	
//	@Test
//	public void login1() {
//		
//		System.out.println("This is login1");
//		
//	}
//	@Test
//	public void login2() {
//		
//		System.out.println("This is login2");
//		System.out.println(1/0);
//	}
//	
//	@Test
//	public void helloWorld() {
//		
//		System.out.println("HelloWorld");
//		
//	}
	
	
}
