package com.interview;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class CssP {

	public WebDriver driver;
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://16273:147258369@s@gestsrvtest/Testing/ContentPages/Dashboard.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_radRoleBasedMenu']/ul/li[1]/a/span"))).perform();
		driver.findElement(By.xpath("//span[text()='Quotes']")).click();
		for(int i =1; i<50;i++)
		{
			long start = System.currentTimeMillis();
			String S=driver.findElement(By.cssSelector("table#ctl00_MainContent_rgMyQuote_ctl00>tbody>tr:nth-child("+i+")>td:nth-child(2)")).getText();
			long finish = System.currentTimeMillis();
			System.out.println(S);
			System.out.println(finish - start);
			if(driver.findElement(By.cssSelector("table#ctl00_MainContent_rgMyQuote_ctl00>tbody>tr:nth-child("+i+")>td:nth-child(2)")).getText().equalsIgnoreCase("GSO-RFQ-15-0256"))
				break;
		}
		driver.close();
		
		
	}

}
