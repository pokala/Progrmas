package com.interview;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserS {

	@Test
	public void test() {
		WebDriver Dirver = new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", ".\\drivers\\IEDriverServer.exe");
		WebDriver driver1=new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver Chrome=new ChromeDriver();
		
//		JavascriptExecutor js=(JavascriptExecutor)driver1;
//		js.e
	}
}
