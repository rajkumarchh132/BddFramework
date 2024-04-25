package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.homePageFactory;
import pageFactory.loginPageFactory;

public class PageFactoryLoginStepsDefinition {
		
	  static WebDriver driver;
	  loginPageFactory login;
	  homePageFactory home;
	  
	  @Given("User is on login page") 
	  public void user_is_on_login_page() { 
		  driver = new ChromeDriver();
		  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("https://www.saucedemo.com/"); 
	  }
	  
	  @When("User enters valid {string} and {string}") 
	  public void user_enters_valid_username_and_password(String username, String password) throws InterruptedException {
		  login = new loginPageFactory(driver);
		  login.enterUsername(username);
		  login.enterPassword(password);
	  }
	  
	  @And("Clicks on Login Button") 
	  public void clicks_on_login_button() {
		  login.clickOnLoginButton();
	  }
	  
	  @Then("User is navigated to Home Page") 
	  public void user_is_navigated_to_home_page() {
		  home = new homePageFactory(driver);
		  home.isCartDisplayed();
	  }
	  
	  @And("Close the browser") public void close_the_browser() { 
		  driver.close();
	  }
	 

}
