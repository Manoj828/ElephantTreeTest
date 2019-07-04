package com.qa.ele.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.ele.base.TestBaseE;

public class TestUtils extends TestBaseE{

	public static long PageLoadTimeout=30;
	public static long ImplicitlyWait=10;
	
	
	public static void TakeScreenShotonException() {
		
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir=System.getProperty("user.dir");
	//	FileUtils.copyFile(scr, new File(currentDir +"/screenshots/" + System.currentTimeMillis() + ".png") );
		try {
			FileUtils.copyFile(scr, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
