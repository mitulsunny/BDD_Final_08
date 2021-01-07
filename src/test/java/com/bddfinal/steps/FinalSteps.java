package com.bddfinal.steps;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.osa.base.Browser;
import com.osa.utilities.Utility;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FinalSteps {
	private static Logger log=Utility.getLog(FinalSteps.class);
	public WebDriver dr;

@Given("^I enter the osa url \"([^\"]*)\"$")
public void i_enter_the_osa_url(String url) throws Throwable {
	dr=Browser.openBrowser("chrome");
	dr.get(url);
	
   log.info("opening OSA home page"); 
}

@And("^I click on forum button$")
public void i_click_on_forum_button() throws Throwable {
	dr.findElement(By.xpath("//a[text()='Forum']")).click();
	log.info("click perform on forum button"); 
}

@And("^I enter Invalid email$")
public void i_enter_Invalid_email() throws Throwable {
    dr.findElement(By.id("username")).sendKeys("abcd");
    log.info("checking with invalid email"); 
}

@Given("^I enter Invalid Password$")
public void i_enter_Invalid_Password() throws Throwable {
	dr.findElement(By.id("password")).sendKeys("1234567"); 
	log.info("checking with invalid password"); 
}

@When("^I click on login button$")
public void i_click_on_login_button() throws Throwable {
	log.info("click perform on login button"); 
}

@Then("^I see invalid username and password$")
public void i_see_invalid_username_and_password() throws Throwable {
    
}

@Given("^I enter valid email$")
public void i_enter_valid_email() throws Throwable {
	log.info("checking with valid email"); 
}

@Given("^I enter valid Password$")
public void i_enter_valid_Password() throws Throwable {
	log.info("checking with valid password"); 
	
}

@And("^I enter valid emailParameter \"([^\"]*)\"$")
public void i_enter_valid_emailParameter(String emailParameter) throws Throwable {
	log.info("using parameterised email"); 
}

@And("^I enter valid PasswordParameter \"([^\"]*)\"$")
public void i_enter_valid_PasswordParameter(String passwordParameter) throws Throwable {
	log.info("using parameterised password"); 
}


@Then("^I verify the student page$")
public void i_verify_the_student_page() throws Throwable {
	log.info("verifing student page"); 
}

@And("^I enter valid email \"([^\"]*)\"$")
public void i_enter_valid_email(String email) throws Throwable {
    
}

@And("^I enter valid Password \"([^\"]*)\"$")
public void i_enter_valid_Password(String password) throws Throwable {
    
}
@And("^I enter the email and password$")
public void i_enter_the_email_and_password(DataTable credentials) throws Throwable {
	List <List <String>> data=credentials.raw();
	//And I enter the email and password
    //|abcd@gmail.com|1234567|
	//driver.findElement(By.id("email")).sendKeys(data.get(0).get(0));
	//driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
	//fl.textEmail(data.get(0).get(0));
	// Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
    
}

	
}
