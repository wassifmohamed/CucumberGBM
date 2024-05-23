package Utils;

import StepDefinitions.PageInitializer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class CommonMethods extends PageInitializer {

   public static WebDriver driver;

    public static void openBrowserAndLaunchApplication(){

        ConfigReader.readProperties();

        String browserType = ConfigReader.getPropertyValue("browserType");
        switch (browserType) {

            case "Chrome":
                driver = new ChromeDriver();
                break;

            case "Firefox":
                driver = new FirefoxDriver();
                break;

            case "IE":
                driver = new InternetExplorerDriver();
                break;

            default:
                driver = new EdgeDriver();
                break;

        }

        driver.manage().window().maximize();
        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(Constants.WAIT_TIME));
        initializerPageObjects();  // this will initialize all the pages we have in our page
                                  // PageInitializer class along with the launching of application
    }

    public static void closeBrowser()
    {
        driver.close();
    }

    public static void  doClick(WebElement element)
    {
        element.click();
    }

    public static void sendText(WebElement element ,String  text)
    {
             element.clear();
             element.sendKeys(text);
    }

    public static  Select clickOnDropDown(WebElement element)
    {
        Select select = new Select(element);
        return select;
    }

    public static void selectByValue(WebElement element, String value)
    {
        clickOnDropDown(element).selectByValue(value);
    }

    public static void selectByVisibleText(WebElement element, String  text)
    {
        clickOnDropDown(element).selectByVisibleText(text);
    }

    public static void selectByIndex(WebElement element,int index)
    {
        clickOnDropDown(element).selectByIndex(index);
    }

    public  static void selectByOptions(WebElement element, String  text)
    {
        List<WebElement> options=clickOnDropDown(element).getOptions();
        for (WebElement option:options)
        {
           String ddOptionText=option.getText();
           if (ddOptionText.equals(text))
           {
               option.click();
           }
        }
    }

}
