package vijay;

import org.testng.annotations.Test;

public class parallel3 {
	@Test
	public void  Test11() {
		System.out.println("11-smoke"+Thread.currentThread().getId());
	}
	
	@Test
	public void Test12() {
		System.out.println("12-sanity"+Thread.currentThread().getId());
	}
	
	@Test
	public void  Test13() {
		System.out.println("13-Functional"+Thread.currentThread().getId());
	}
	@Test
	public void  Test14() {
		System.out.println("14-Regression"+Thread.currentThread().getId());
	}
	@Test
	public void  Test15() {
		System.out.println("15-Retesting"+Thread.currentThread().getId());
	}

}
