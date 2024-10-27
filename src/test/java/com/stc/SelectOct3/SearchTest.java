package com.stc.SelectOct3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTest {
	public WebDriver driver=null;
	
	@BeforeSuite
	public void tearUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//ChromeOptions op=new ChromeOptions();
		//op.addArguments("--headless");
		//driver=new ChromeDriver();
		driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
	}
	
	@Test
  public void f() {
	  driver.manage().window().maximize();
	  try
	  {
		  Thread.sleep(2000);
	  POMSearch ss=new POMSearch(driver);
	  ss.sendF("hi");
	  ss.sendL("hello");
	  ss.clickQA();
	  String actual=driver.findElement(By.xpath("//b")).getText();
	  String expected="Hello QA";
	  Assert.assertEquals(actual, expected);
	  
	  }
	  catch(Exception e)
	  {
		  System.out.println( e.getMessage());
	  }
  }
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	
}
