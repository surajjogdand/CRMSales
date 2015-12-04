package com.tagrem.crmsales.login;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import com.tagrem.crmsales.driver.ApiDriver;

import org.apache.log4j.Logger;
import org.junit.Assert;


public class Login extends LoadableComponent<Login> {
	
	private String url = "http://mobileapi.tagrem.com:8080/CrmSalesTeam-0.0.1/swagger/index.html";
	private String title = "Welcome";
	Actions action = null;
	Logger log;
	
	public Login() {
		PageFactory.initElements(ApiDriver.getInstance(), this);
		ApiDriver.getInstance().manage().window().maximize();
		action = new Actions(ApiDriver.getInstance());
	}

	@Override
	protected void load() {
		ApiDriver.getInstance().get(url);
		log = Logger.getLogger(Login.class);
		log.info("Load URL");
	}

	@Override
	protected void isLoaded() throws Error {
		
		Assert.assertTrue(ApiDriver.getInstance().getTitle().equals(title));
		
	}

}
