package POMFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.samplewebtest.Base;

public class LoginPage extends Base {
public LoginPage() {
	PageFactory.initElements(driver, this);
}
@CacheLookup
@FindBy (xpath="//div[text()='Sign In']")
private WebElement SignIn;

public WebElement getSignIn() {
	return SignIn;
}


public void setSignIn(WebElement signIn) {
	SignIn = signIn;
}


public WebElement getCreateAcc() {
	return CreateAcc;
}


public void setCreateAcc(WebElement createAcc) {
	CreateAcc = createAcc;
}


public WebElement getCustomerName() {
	return CustomerName;
}


public void setCustomerName(WebElement customerName) {
	CustomerName = customerName;
}


public WebElement getEMail() {
	return EMail;
}


public void setEMail(WebElement eMail) {
	EMail = eMail;
}


public WebElement getPassword() {
	return Password;
}


public void setPassword(WebElement password) {
	Password = password;
}


public WebElement getMainSection() {
	return MainSection;
}


public void setMainSection(WebElement mainSection) {
	MainSection = mainSection;
}


public WebElement getPasswordchk() {
	return Passwordchk;
}


public void setPasswordchk(WebElement passwordchk) {
	Passwordchk = passwordchk;
}


public WebElement getContinue() {
	return Continue;
}


public void setContinue(WebElement continue1) {
	Continue = continue1;
}
@FindBy (xpath="//a[text()='Create a New Account']")
private WebElement CreateAcc;

@FindBy(name="customerName")
private WebElement CustomerName;

@FindBy(name="email")
private WebElement EMail;

@FindBy(name="password")
private WebElement Password;

@FindBy(id="authportal-main-section")
private WebElement MainSection;

@FindBy (xpath="//*[@id='ap_password_check']")
private WebElement Passwordchk;

@FindBy(id="continue")
private WebElement Continue;

/*driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
driver.findElement(By.name("password")).sendKeys("aghgjh");
driver.findElement(By.id("authportal-main-section")).click();
driver.findElement(By.name("passwordCheck")).sendKeys("aghgjh");
driver.findElement(By.id("continue")).click();
public WebElement getTxtUserName() {
	return txtUserName;
}

*/
public WebElement getTxtPassword() {
	return getTxtPassword();
}


public WebElement getBtnLogin() {
	return getBtnLogin();
}



}


//@FindBy(xpath="//input[@value='Login']")




