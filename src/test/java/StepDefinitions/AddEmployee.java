package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.CompletableFuture;

public class AddEmployee extends CommonMethods {



    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        // driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
        WebElement pimTab =driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        doClick(pimTab);

    }
    @When("add clicks on add employee option")
    public void add_clicks_on_add_employee_option() {
        driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();

    }
    @When("user enter firstname and middlename and lastname")
    public void user_enter_firstname_and_middlename_and_lastname() {

        //driver.findElement(By.id("firstName")).sendKeys(ConfigReader.getPropertyValue("firstname"));
          WebElement firstNameTextBox =driver.findElement(By.id("firstName"));
          sendText(firstNameTextBox,ConfigReader.getPropertyValue("firstname"));

        //driver.findElement(By.id("middleName")).sendKeys(ConfigReader.getPropertyValue("middlename"));
        WebElement middleNameTextBox= driver.findElement(By.id("middleName"));
          sendText(middleNameTextBox,ConfigReader.getPropertyValue("middlename"));

        //driver.findElement(By.id("lastName")).sendKeys(ConfigReader.getPropertyValue("lastname"));
        WebElement lastNameTextBox = driver.findElement(By.id("lastName"));
          sendText(lastNameTextBox, ConfigReader.getPropertyValue("lastname"));

    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        WebElement saveBtn= driver.findElement(By.id("btnSave"));
        doClick(saveBtn);

    }
}
