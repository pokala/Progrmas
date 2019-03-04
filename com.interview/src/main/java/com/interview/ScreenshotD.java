package com.interview;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;


public class ScreenshotD {
	
	@Test
	public void test() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("www.google.com");
		TakesScreenshot st=(TakesScreenshot)driver;
		File f=st.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("Screenshot//image.png"));
	}

}
