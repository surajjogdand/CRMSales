package com.tagrem.crmsales.testngfile;

import org.testng.annotations.Test;

import com.tagrem.crmsales.login.Login;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
	Login login = new Login();
  @Test
  public void f() {
	  System.out.println("hi");
  }
  @BeforeSuite
  public void beforeSuite() {
	  login = new Login();
	  login.get();
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Done with API testing");
  }

}
