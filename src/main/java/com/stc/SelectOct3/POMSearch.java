package com.stc.SelectOct3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMSearch {

	public WebDriver driver=null;
	public String f="fname";
	public String l="lname";
	public String q="//a[@name='QA']";
	
	public POMSearch(WebDriver driver) {
	this.driver=driver;
	}

	public WebElement getF()
	{
		WebElement fn=null;
		fn=driver.findElement(By.id(f));
		return fn;
	}
	
	public WebElement getL()
	{
		WebElement ln=null;
		ln=driver.findElement(By.id(l));
		return ln;
	}
	
	public WebElement getQA()
	{
		WebElement qa=null;
		qa=driver.findElement(By.xpath(q));
		return qa;
	}
	
	
	public void sendF(String ff)
	{
		try
		{
			getF().sendKeys(ff);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
	}
	
	public void sendL(String ll)
	{
		try
		{
			getL().sendKeys(ll);
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
	}
	

	public void clickQA()
	{
		try
		{
getQA().click();
Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
	}
	
	
	
	
}
