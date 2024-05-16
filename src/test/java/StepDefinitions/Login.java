package StepDefinitions;


import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class Login extends CommonMethods {




    @Given("open the browser and launch HRMS application")
    public void open_the_browser_and_launch_hrms_application() {

        openBrowserAndLaunchApplication();

    }

    @Then("user enter valid email and valid password")
    public void user_enter_valid_email_and_valid_password() {

      //  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(ConfigReader.getPropertyValue("username"));
            WebElement usernameTextBox =driver.findElement(By.xpath("//input[@id='txtUsername']"));
            sendText(usernameTextBox,ConfigReader.getPropertyValue("username"));
            
      //  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(ConfigReader.getPropertyValue("password"));
         WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='txtPassword']"));
         sendText(passwordTextBox, ConfigReader.getPropertyValue("password"));


    }
    @Then("click on login button")
    public void click_on_login_button() {
       WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
       doClick(loginBtn);


    }

    @Then("user is logged in successfully")
    public void user_is_logged_in_successfully() {
          boolean userloggedIn =driver.findElement(By.xpath("//a[contains(text(),'Welcome')]")).isDisplayed();
          if (userloggedIn){
              System.out.println(" user is logged in Successfully ");
          }

    }

    @Then("Close the browser")
    public void close_the_browser() {
        //  closeBrowser();
    }

}
