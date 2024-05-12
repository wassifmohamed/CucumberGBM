package StepDefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    WebDriver driver;


    @Given("open the browser and launch HRMS application")
    public void open_the_browser_and_launch_hrms_application() {

         driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");


    }
    @Then("user enter valid email and valid password")
    public void user_enter_valid_email_and_valid_password() {
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");


    }
    @Then("click on login button")
    public void click_on_login_button() {
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();


    }

    @Then("user is logged in successfully")
    public void user_is_logged_in_successfully() {
          boolean userloggedIn =driver.findElement(By.xpath("//a[contains(text(),'Welcome')]")).isDisplayed();
          if (userloggedIn){
              System.out.println(" user is logged in Successfully ");
          }

    }

}
