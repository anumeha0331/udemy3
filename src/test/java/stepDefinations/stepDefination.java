package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {
public WebDriver driver;
	
	/*@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		
	}

	@Given("^click on the \"([^\"]*)\" site$")
	public void click_on_the_site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(arg1);
	}

	@When("^user enters anumeha\\.(\\d+)@gmail\\.com and (\\d+)$")
	public void user_enters_anumeha_gmail_com_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		driver.findElement(By.id("email")).sendKeys(arg1);
		driver.findElement(By.id("pass")).sendKeys(arg2);
		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
	}

	@Then("^verify user is successfully login$")
	public void verify_user_is_successfully_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		driver.close();
	}

	@When("^user enters test@gmail\\.com and (\\d+)$")
	public void user_enters_test_gmail_com_and(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		driver.findElement(By.id("email")).sendKeys(arg1);
		driver.findElement(By.id("pass")).sendKeys(arg2);
		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
	}*/

@Given("^Initialize the browser with chrome$")
public void initialize_the_browser_with_chrome() throws Throwable {
  //  throw new PendingException();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
	 driver = new ChromeDriver();
}

@When("^user enters (.+) and (.+)$")
public void user_enters_and(String username, String password) throws Throwable {
   // throw new PendingException();
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
}

@Then("^verify user is successfully login$")
public void verify_user_is_successfully_login() throws Throwable {
    //throw new PendingException();
}

@And("^click on the \"([^\"]*)\" site$")
public void click_on_the_something_site(String strArg1) throws Throwable {
    //throw new PendingException();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(strArg1);
}

@And("^close browser$")
public void close_browser() throws Throwable {
    //throw new PendingException();
	driver.close();
}

}
