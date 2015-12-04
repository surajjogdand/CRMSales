package com.tagrem.crmsales.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ApiDriver {
	private static ApiDriver _apiDriver;
	static WebDriver driver = null;
	private ApiDriver() {
	}
	
	public static WebDriver getInstance()
	{
		if(_apiDriver == null)
		{
		_apiDriver = new ApiDriver();
		 driver = new FirefoxDriver();
		}
		
		return driver;
	}

}
