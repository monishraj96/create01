package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sample {
	@Parameters({"userName","password"})
	@Test
private void test1(String name,String pass) {
		System.out.println(name);
		System.out.println(pass);
	}
}
