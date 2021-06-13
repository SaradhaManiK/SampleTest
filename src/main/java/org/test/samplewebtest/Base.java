package org.test.samplewebtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
		public WebDriver launchbrowser(String url) {
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\BrowserDetails\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
			return driver;
		}
		public void sendtext(WebElement element, String string) {
			element.sendKeys(string);
		}
		public void btnclick (WebElement element) {
			element.click();
		}
		public void quitbrowser(WebDriver driver) {
			driver.quit();
		}
		
			
		}

			
 


