package StepDefinitions;


import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class Login extends CommonMethods {




    @Given("open the browser and launch HRMS application")
    public void open_the_browser_and_launch_hrms_application() {

        openBrowserAndLaunchApplication();

    }

    @Then("user enter valid email and valid password")
    public void user_enter_valid_email_and_valid_password() {
        LoginPage login = new LoginPage();

      //  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(ConfigReader.getPropertyValue("username"));
        //    WebElement usernameTextBox =driver.findElement(By.xpath("//input[@id='txtUsername']"));
        sendText(login.usernameTextBox,ConfigReader.getPropertyValue("username"));
            
      //  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(ConfigReader.getPropertyValue("password"));
         //WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='txtPassword']"));
       sendText(login.passwordTextBox, ConfigReader.getPropertyValue("password"));


    }
    @Then("click on login button")
    public void click_on_login_button() {
        LoginPage login = new LoginPage();
      // WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
    doClick(login.loginBtn);


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
          closeBrowser();
    }

    @Then("user enter valid {string} and valid {string}")
    public void user_enter_valid_and_valid(String username, String password) {
        LoginPage login = new LoginPage();
       // WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
        sendText(login.usernameTextBox,username);

       // WebElement passwordTextBox =driver.findElement(By.id("txtPassword"));
        sendText(login.passwordTextBox,password);
    }

    @When("user enters username and password and verifies login")
    public void user_enters_username_and_password_and_verifies_login(DataTable dataTable) {

          LoginPage login = new LoginPage();
        List<Map<String, String>> userCredentials=dataTable.asMaps();
        for (Map<String ,String > userCreds:userCredentials){

         String username =userCreds.get("username");
         String password =userCreds.get("password");

            sendText(login.usernameTextBox,username);
            sendText(login.passwordTextBox,password);
            doClick(login.loginBtn);
            doClick(login.welcomeIcon);
            doClick(login.logoutLink);

        }

    }

}
