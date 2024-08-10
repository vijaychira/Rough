package vijay;

import org.testng.annotations.Test;

public class parallel {
	@Test
	public void Test1() {
		System.out.println("1-smoke"+Thread.currentThread().getId());
	}
	
	@Test
	public void Test2() {
		System.out.println("2-sanity"+Thread.currentThread().getId());
	}
	
	@Test
	public void Test3(q) {
		System.out.println("3-Functional"+Thread.currentThread().getId());
	}
	@Test
	public void Test4() {
		System.out.println("4-Regression"+Thread.currentThread().getId());
	}
	@Test
	public void Test5() {
		System.out.println("5-Retesting"+Thread.currentThread().getId());
	}
}
