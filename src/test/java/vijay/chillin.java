package vijay;

import java.util.Arrays;

import org.testng.annotations.Test; 

public class chillin {
	 String name;
	void setname(String name) {
		this.name=name;

	}
	@Test(dataProvider = "")
	void getname(int a,int b) {
		System.out.println(a+b);
	}
	@Test
	void wolf() {
		chillin c=new chillin();
		c.setname("Wolf");
		c.getname(1,2);
	}
}
