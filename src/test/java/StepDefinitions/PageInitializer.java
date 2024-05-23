package StepDefinitions;

import Pages.AddEmployeePage;
import Pages.LoginPage;
import io.cucumber.java.bs.A;

public class PageInitializer {

    public static LoginPage login;
    public static AddEmployeePage addEmployeePage;



    public static void initializerPageObjects(){

     login = new LoginPage();
         addEmployeePage = new AddEmployeePage();
    }

}





// this class will manage the object creation of different page Objects in our Framework .
// Instead of calling the page objects again and again , this class will take good care of that step