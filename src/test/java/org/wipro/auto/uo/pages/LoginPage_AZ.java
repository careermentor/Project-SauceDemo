package org.wipro.auto.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.wipro.auto.uo.commonutilities.ReadPropFiles;

public class LoginPage_AZ 
{
	WebDriver driver;

	public LoginPage_AZ(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="user-name")
	WebElement username_textbox;
	
	@FindBy(name="password")
	WebElement password_textbox;
	
	@FindBy(css="[value='Login']")
	WebElement login_bttn;
	
	
	public void enter_username(String uname) throws Exception
	{
		username_textbox.sendKeys(uname);
		
	}
	
	public void enter_password(String pass) throws Exception
	{
		password_textbox.sendKeys(pass);
		
	}

	public void click_loginbttn() throws Exception
	{
		login_bttn.click();
		
	}
	
	
}
