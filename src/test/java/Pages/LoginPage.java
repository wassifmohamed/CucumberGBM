package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {

    public LoginPage()
    {
        PageFactory.initElements(driver, this); // initializing thw webElements of the current page
    }


    @FindBy(id="txtUsername")
    public  WebElement usernameTextBox;


    @FindBy(id ="txtPassword")
    public WebElement passwordTextBox;

    @FindBy(id="btnLogin")
    public WebElement loginBtn;

    @FindBy(xpath="//a[contains(text(),'Welcome')]")
    public WebElement welcomeIcon;


    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement  logoutLink;





    // page Factory Model


}
