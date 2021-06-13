package POMFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.samplewebtest.Base;

public class TopRatedTVShowsPage extends Base {
public TopRatedTVShowsPage() {
	PageFactory.initElements(driver, this);
}
@CacheLookup
@FindBy (xpath="//div[@class='ipc-button__text']")
private WebElement menubutton;

public WebElement getMenubutton() {
	return menubutton;
}


public void setMenubutton(WebElement menubutton) {
	this.menubutton = menubutton;
}


public WebElement getTopRatedShows() {
	return TopRatedShows;
}


public void setTopRatedShows(WebElement topRatedShows) {
	TopRatedShows = topRatedShows;
}


public WebElement getSearch() {
	return Search;
}


public void setSearch(WebElement search) {
	Search = search;
}


public WebElement getGameofThrones() {
	return GameofThrones;
}


public void setGameofThrones(WebElement gameofThrones) {
	GameofThrones = gameofThrones;
}


public WebElement getReviewelement() {
	return reviewelement;
}


public void setReviewelement(WebElement reviewelement) {
	this.reviewelement = reviewelement;
}
@FindBy (xpath="//*[@id='imdbHeader']/div[2]/aside/div/div[2]/div/div[2]/div[1]/span/div/div/ul/a[3]")
private WebElement TopRatedShows;

@FindBy (id="suggestion-search")
private WebElement Search;

@FindBy (xpath="/h1[text()='Game of Thrones']")
private WebElement GameofThrones;

@FindBy (xpath="/h1[//span[text()=9.3]']")
private WebElement ratingelement;

public WebElement getRatingelement() {
	return ratingelement;
}


public void setRatingelement(WebElement ratingelement) {
	this.ratingelement = ratingelement;
}
@FindBy (xpath="//a[@href='/title/tt0944947/reviews?ref_=tt_ov_rt']//span//span[@class='score']")
private WebElement reviewelement;



}





