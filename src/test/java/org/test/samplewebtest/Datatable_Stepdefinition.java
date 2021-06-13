// Here Datatable is used.
//Instead Scenario Outline can be used with Examples keyword to traverse multiple datas and random methods can be used too
package org.test.samplewebtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POMFiles.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Datatable_Stepdefinition extends Base {
    
	@Given("^the user is in homepage$")
	public void the_user_is_in_homepage() throws Exception {
	    Base b=new Base();
    	b.launchbrowser("http://www.imdb.com");
	}

	@When("^the user clicks create new account$")
	public void the_user_clicks_create_new_account() throws Exception {
		 Base b=new Base();
		LoginPage LogPage =new LoginPage();

		//2.1
    	b.btnclick(LogPage.getSignIn());
    	
    	//Using Explicit wait to wait for Create a New Account button
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Create a New Account']")));
		b.btnclick(LogPage.getCreateAcc());
   	}

	@When("^the users enters the Customer name$")
	public void the_users_enters_the_Customer_name(DataTable username) throws Exception {
		//public void the_users_enters_the_Customer_name() throws Exception {	
		Base b=new Base();
		 LoginPage LogPage =new LoginPage();
		 List<String> data_nameslist = username.asList(String.class);
		 b.sendtext(LogPage.getCustomerName(),data_nameslist.get(0));
		 b.sendtext(LogPage.getCustomerName(),data_nameslist.get(1));
		 //throw new PendingException();
	}


	@When("^the users enters the Email$")
	public void the_users_enters_the_Email(DataTable email) throws Exception {
		 Base b=new Base();
		LoginPage LogPage =new LoginPage();
		 List<String> data_email = email.asList(String.class);
		 b.sendtext(LogPage.getEMail(),data_email.get(0));
		 b.sendtext(LogPage.getEMail(),data_email.get(1));
		 //throw new PendingException();
	}

	@When("^the users enters the Password$")
	public void the_users_enters_the_Password(DataTable password) throws Exception {
		 Base b=new Base();
		LoginPage LogPage =new LoginPage();
		 List<String> data_password = password.asList(String.class);
		 b.sendtext(LogPage.getPassword(),data_password.get(0));
		 b.sendtext(LogPage.getPassword(),data_password.get(1));
		}

	@When("^the users reenters the password$")
	public void the_users_reenters_the_password(DataTable repassword) throws Exception {
		 Base b=new Base();
		LoginPage LogPage =new LoginPage();
		 List<String> data_repassword = repassword.asList(String.class);
		 b.sendtext(LogPage.getPasswordchk(),data_repassword.get(0));
		 b.sendtext(LogPage.getPasswordchk(),data_repassword.get(1));
		
	}

	@When("^the users clicks Continue$")
	public void the_users_clicks_Continue() throws Exception {
		 Base b=new Base();
		LoginPage LogPage =new LoginPage();
		b.btnclick(LogPage.getContinue());
	 
	}

	@Then("^verify the relevant message is displayed$")
	public void verify_the_relevant_message_is_displayed() throws Exception {
	    driver.findElement(By.name("cvf_captcha_captcha_action")).isDisplayed();
		//Assert.assertEquals("but an account already exists", message.contains("an account already exists"));
	    driver.close();
	}

	
}
