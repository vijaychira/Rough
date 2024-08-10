package vijay;

import org.testng.annotations.Test;

public class parrallel2 {
	
		@Test
		public void Test6() {
			System.out.println("6-smoke"+Thread.currentThread().getId());
		}
		
		@Test
		public void   Test7() {
			System.out.println("7-sanity"+Thread.currentThread().getId());
		}
		
		@Test
		public void  Test8() {
			System.out.println("8-Functional"+Thread.currentThread().getId());
		}
		@Test
		public void  Test9() {
			System.out.println("9-Regression"+Thread.currentThread().getId());
		}
		@Test(priority=5)
		public void Test10() {
			System.out.println("10-Retesting"+Thread.currentThread().getId());
		}

}
