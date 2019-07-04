package com.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ele.base.TestBaseE;
import com.qa.ele.pages.HomePageE;

public class HomePageTestE extends TestBaseE {

	HomePageE homepage;
	
	public HomePageTestE()
	{
		super();
	}
	
	
   @BeforeMethod()
   public void setup()
  {
	Initialisation();
	homepage = new HomePageE();
  }
	

  @Test(priority=1)
  public void LogoTest()
  {
	 Assert.assertTrue(homepage.VerifyLogo());
  } 

  @Test(priority=2)
  public void AboutTitleTest() throws InterruptedException
  {
	Assert.assertTrue(homepage.VerifyProcessTitle());  
  }

  
  @Test(priority=3)
  public void ServicesTitleTest() throws InterruptedException
  {
	Assert.assertTrue(homepage.VerifyServicesTitle());  
  }

  
  @Test(priority=4) // purposely failing this test in order to capture the screenshot on failure
  public void ProcessTitleTest() throws InterruptedException
  {
	Assert.assertTrue(homepage.VerifyProcessTitle());  
  }
  

  @Test(priority=5)
  public void CareerTitleTest() throws InterruptedException
  {
	Assert.assertTrue(homepage.VerifyCareerTitle());  
  }
  
  @Test(priority=6)
  public void TeamTitleTest() throws InterruptedException
  {
	Assert.assertTrue(homepage.VerifyTeamTitle());  
  }

   @AfterMethod()
   public void tearup()
   {
	 driver.quit();
   }


}
