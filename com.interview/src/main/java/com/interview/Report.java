package com.interview;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Report {
	
	@Test
	public void test() throws Exception {
		 System.setProperty("webdriver.ie.driver","drivers//IEDriverServer.exe");
		 WebDriver driver = new InternetExplorerDriver();
		 driver.get("http://global\\81238285:login@123@10.128.0.191/Reports/");
		 Thread.sleep(10000);
//		WebDriver driver= new FirefoxDriver();
//		 type("global\\81238285");
//		 Robot robot= new Robot();
//		 robot.keyPress(KeyEvent.VK_TAB);
//		 robot.keyRelease(KeyEvent.VK_TAB);
//		 type("login@123");
//		 robot.keyPress(KeyEvent.VK_ENTER);
//		 robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'WasteReport')]")).click();
		driver.findElement(By.id("ctl32_ctl04_ctl03_txtValue")).sendKeys("8/24/2016");
		driver.findElement(By.xpath("//td/input")).click();

	}
	private void type(String s) throws Exception
	  {
		
		StringSelection stringSelection = new StringSelection(s);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, stringSelection);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
	    }
//	  }

}
