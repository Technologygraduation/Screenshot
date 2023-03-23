package org.org;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("WebDriver.chrome.driver", 
				"C:\\Users\\PREETHI\\eclipse-workspace\\Selenium Projects\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		//typecast
		
	    TakesScreenshot tk = (TakesScreenshot) driver;
	    
	    File java = tk.getScreenshotAs(OutputType.FILE);
	    
	    File java1 = new File ("C:\\Users\\PREETHI\\eclipse-workspace\\Selenium Projects\\Screenshot\\flipkart.png");
	    
	    FileHandler.copy(java, java1);
	    
}

	
}


