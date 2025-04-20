package org.wipro.auto.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.uo.baseutilities.InitiateBrowser;
import org.wipro.auto.uo.pages.LoginPage_SM;

public class LoginScenario_AZ extends InitiateBrowser
{

	@Test
	public void tc01_validate_valid_login_func() throws Exception
	{
		LoginPage_SM login = new LoginPage_SM(driver);
		
		login.enter_username("problem_user");
		login.enter_password("secret_sauce");
		login.click_loginbttn();
		
		//because "this.driver" is null
		
	}
	
	
}
