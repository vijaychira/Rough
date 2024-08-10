package vijay;

import org.testng.annotations.Test;
public class wolf {
	@Test(priority=1)
    public void openwebsite() {
		System.out.println("openwebsite");
	}
	@Test(priority=2,groups= {"Sanity", "Regression"})
	public void signup() {
		System.out.println("signup");
	}
	
	@Test(priority=3)
	public void login() {
		System.out.println("Login");
	}
	@Test(priority=4)
	public void chooseDate() {
		System.out.println("choose date");
	}
	@Test(priority=5,groups= {"Sanity","Regression"})
	public void bookFlight() {
		System.out.println("bookflight");
	}
	@Test(enabled=false)
	public void saveTicket() {
		System.out.println("saveTiicket");
	}
	@Test(priority=7,groups= {"Sanity"})
	public void signout() {
		System.out.println("signout");
	}
}
