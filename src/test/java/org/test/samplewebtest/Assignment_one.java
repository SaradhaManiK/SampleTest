package org.test.samplewebtest;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POMFiles.TopRatedTVShowsPage;
import junit.framework.Assert;

public class Assignment_one extends Base {

	public static void main(String[] args) throws InterruptedException {
		Base b=new Base();
		b.launchbrowser("http://www.imdb.com");
		
		TopRatedTVShowsPage TopRatedPage=new TopRatedTVShowsPage();
		//2.a.
		b.btnclick(TopRatedPage.getMenubutton());
		b.btnclick(TopRatedPage.getTopRatedShows());
		
		//2.b
		b.sendtext(TopRatedPage.getSearch(), "Game of thrones");
		
		
		driver.findElement(By.id("suggestion-search")).sendKeys(Keys.ENTER);
		
		List<WebElement> tRows=driver.findElements(By.tagName("tr"));
		for(WebElement tr:tRows) 
		{
			List<WebElement> tData=tr.findElements(By.tagName("td"));
			for(WebElement td:tData) 
			{	
				System.out.println(td.getText());
				for (int i=0;i<=12;i++) {
					if (i==12) {
						td.click();
					}
				}
		//3.a.
				WebDriverWait wait = new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("h1[@class='TitleHeader__TitleText-sc-1wu6n3d-0 dxSWFG")));
				//String title=driver.findElement(By.xpath("//h1[@class='TitleHeader__TitleText-sc-1wu6n3d-0 dxSWFG']")).getText();
				String title=driver.findElement(By.xpath("//h1[text()='Game of Thrones']")).getText();
				System.out.println(title);
				//String title=driver.findElement(By.xpath("//h1[text()='Game of Thrones']")).getText();
				Assert.assertEquals("Game of Thrones",title);
				
		//3.b.
				//String rating=driver.findElement(By.xpath("//span[@class='AggregateRatingButton__RatingScore-sc-1il8omz-1 fhMjqK']")).getText();
				String rating=driver.findElement(By.xpath("//span[text()=9.3]")).getText();
				System.out.println(rating);
				Assert.assertEquals("9.3",rating);
				
		//3.c
				String noofreviews=driver.findElement(By.xpath("//a[@href='/title/tt0944947/reviews?ref_=tt_ov_rt']//span//span[@class='score']")).getText();
				System.out.println(noofreviews);
				Assert.assertEquals("4.9K",noofreviews);
				
								
			}
			b.quitbrowser(driver);
		}
		
		
	}
			//	String data=td.getText();
			//	String x[]=data.split("  ");
			//	for (String d:x) {
			//		while(d.equals("Game of Thrones: The Last Watch")) {
			//			td.click();
				
					

				//while (td.spligetText().contains("Game of Thrones: The Last Watch"))
				//{
				//	System.out.println("Entering equals");
				//	td.click();
				//}
				
			

	
	}



