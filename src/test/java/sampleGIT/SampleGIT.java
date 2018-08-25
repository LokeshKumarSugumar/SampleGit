package sampleGIT;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleGIT {
	@Test
		public void login() throws InterruptedException, IOException
		{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com");
		Thread.sleep(2000);
		WebElement input=driver.findElement(By.id("sb_form_q"));
		input.sendKeys("test");
		input.sendKeys(Keys.ENTER);
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File ("D:\\Seleniumworkspace\\SampleGIT\\Screenshot\\bing.jpg"));
		}

	}


