package com.interview;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class s3 {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","D:\\eclipse\\Workspace\\Practice\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		WebDriverBackedSelenium selenium = new WebDriverBackedSelenium(driver,"http://www.google.com/");
		
	}

}
