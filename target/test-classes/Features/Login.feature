Feature: Login Functionalities


  @smoke
    Scenario:  Valid Admin Login
      #Given    open the browser and launch HRMS application
      Then     user enter valid email and valid password
      And      click on login button
      Then     user is logged in successfully
      #And      Close the browser


  @smoke2
  Scenario:  Valid Admin Login
      #Given    open the browser and launch HRMS application
    Then     user enter valid "ADMIN" and valid "Hum@nhrm123"
    And      click on login button
    Then     user is logged in successfully
      #And      Close the browser


    # HOOKS : for defining pre and Post steps in any Cucumber framework
    # HOOKS :  this is always created inside the StepDefinitions folder
    #       :  this class cannot be inherited
     # hooks will take care of pre and post conditions irrespective of what


