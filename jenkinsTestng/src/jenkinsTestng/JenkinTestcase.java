package jenkinsTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JenkinTestcase {
	@BeforeMethod
	void kk(){
		System.out.println("before method");
	}
	@Test
	public static void test1() throws InterruptedException{
		System.out.println("this is from jenkins test");
		WebDriver w=new FirefoxDriver();
		w.manage().window().maximize();
		w.get("https://www.google.com/?gws_rd=ssl");
		Thread.sleep(4000);
		w.quit();
		
		
	}
	@Test
	void mu(){
		System.out.println("hi second testcase");
	}
	

}
