package com.qa.ele.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ele.base.TestBaseE;

public class HomePageE extends TestBaseE{

	
	@FindBy(xpath="//img[@alt='Elephanttree']") 
	WebElement logo;
	
	@FindBy(xpath="//a[contains(text(),'Home')]") 
	WebElement HomeLink;
	
	@FindBy(xpath="//a[contains(text(),'About')]") 
	WebElement AboutLink;
	
	@FindBy(xpath="//h2[contains(text(),'ABOUT US')]") 
	WebElement AboutTitle;
	
	@FindBy(xpath="//a[contains(text(),'Services')]") 
	WebElement ServicesLink;
	
	@FindBy(xpath="//h2[contains(text(),'SERVICES')]") 
	WebElement ServicesTitle;
	
	@FindBy(xpath="//a[contains(text(),'Process')]") 
	WebElement ProcessLink;
	
	@FindBy(xpath="//h2[contains(text(),'OUR PROCES']") 
	WebElement ProcessTitle;
	
	@FindBy(xpath="//a[contains(text(),'Career')]") 
	WebElement CareerLink;
	
	@FindBy(xpath="//h2[contains(text(),'Career')]") 
	WebElement CareerTitle;
	
	@FindBy(xpath="//a[contains(text(),'Team')]") 
	WebElement TeamLink;
	
	@FindBy(xpath="//h3[contains(text(),'Meet our directors')]") 
	WebElement TeamTitle;

	
public HomePageE()
{
	PageFactory.initElements(driver, this);
}

public boolean VerifyLogo()
{
	return logo.isDisplayed();
}


public void VerifyHomeLink()
{
	HomeLink.click();
	
}

public boolean VerifyAboutTitle() throws InterruptedException
{
	
	AboutLink.click();
	Thread.sleep(3000);
	return AboutTitle.isDisplayed();

}


public boolean VerifyServicesTitle() throws InterruptedException
{
	
	ServicesLink.click();
	Thread.sleep(3000);
	return ServicesTitle.isDisplayed();

}

public boolean VerifyProcessTitle() throws InterruptedException
{
	
	ProcessLink.click();
	Thread.sleep(3000);
	return ProcessTitle.isDisplayed();

}

public boolean VerifyCareerTitle() throws InterruptedException
{
	
	CareerLink.click();
	Thread.sleep(3000);
	return CareerTitle.isDisplayed();

}

public boolean VerifyTeamTitle() throws InterruptedException
{
	
	TeamLink.click();
	Thread.sleep(3000);
	return TeamTitle.isDisplayed();

}


}

