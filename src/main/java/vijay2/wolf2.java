package vijay2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Test(groups="all")
public class wolf2 {
	@Test(priority=1,groups={"Sanity", "UAT"})
    public void openwebsite() {
		System.out.println("openwebsite");
	}
	@Test(priority=2,groups= {"UAT"})
	public void signup() {
		System.out.println("wolf");
	}
	@Test(priority=3,groups= {"UAT","Sanity"})
	public void login() {
		System.out.println("dog");
	}
	@Test(priority=4,groups= {"Smoke","Regression"})
	public void chooseDate() {
		System.out.println("smoke");
	}
	@Test(priority=5,groups= {"Sanity","Smoke"})
	public void bookFlight() {
		System.out.println("Smoke");
	}
	@Test(priority=6,groups= {"Regression"})
	public void saveTicket() {
		System.out.println("Zendaya");
	}
	@Test(priority=7,groups= {"UAT","Smoke"})
	public void signout() {
		System.out.println("smoke");
	}

}
