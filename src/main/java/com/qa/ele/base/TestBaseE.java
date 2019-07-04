package com.qa.ele.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.qa.ele.utils.TestUtils;
import com.qa.ele.utils.WebEventListener;

public class TestBaseE {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
    public static WebEventListener eventListener;
	
	
	String File_Path ="C:\\Users\\Admin\\eclipse-workspace\\ElephantTreeTest\\src\\main\\java\\com\\qa\\ele\\config\\confi.properties"; 
	public TestBaseE()
	{
		
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream(File_Path);
				prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void Initialisation()
	{
		String Browser=prop.getProperty("browser");
		
		if(Browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\Testing\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(Browser.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\Testing\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
	// to creat	
	 e_driver=new EventFiringWebDriver(driver);
	 eventListener=new WebEventListener();
	 e_driver.register(eventListener);
	 driver = e_driver;
		
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.ImplicitlyWait, TimeUnit.SECONDS);
		
		
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	
	
	
	
	
	
	
}
