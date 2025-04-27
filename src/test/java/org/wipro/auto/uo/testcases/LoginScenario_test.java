package org.wipro.auto.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.uo.baseutilities.InitiateBrowser;
import org.wipro.auto.uo.commonutilities.ReadPropFiles;
import org.wipro.auto.uo.pages.LoginPage;

public class LoginScenario_test extends InitiateBrowser
{

	@Test
	public void tc01_validate_valid_login_func() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username("standard_user");
		login.enter_password("secret_sauce");
		login.click_loginbttn();
		
		//because "this.driver" is null
		
	}
	
	@Test
	public void tc02_validate_valid_login_func() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username("standard_user");
		login.enter_password("secret_sauce");
		login.click_loginbttn();
		
		//because "this.driver" is null
		
	}
	
	//this test case read data from properties file
	@Test
	public void tc01_validate_invalid_login_func() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(ReadPropFiles.readconfig("username"));
		login.enter_password(ReadPropFiles.readconfig("password"));
		login.click_loginbttn();
		
		//because "this.driver" is null
		
	}
}
