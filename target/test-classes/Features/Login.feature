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


  @scenarioOutline
  # Parametrization / Data Driven
  Scenario Outline:
      #Given    open the browser and launch HRMS application
    Then     user enter valid "<username>" and valid "<password>"
    And      click on login button
    Then     user is logged in successfully
      #And      Close the browser
    Examples:
      | username | password    |
      | admin    | Hum@nhrm123 |
      | ADMIN    | Hum@nhrm123 |
      | Jason    | Hum@nhrm123 |

    @dataTable
  Scenario:  login with multiple credentials using data table
  When  user enters username and password and verifies login
    | username | password    |
    | admin    | Hum@nhrm123 |
    | ADMIN    | Hum@nhrm123 |
   # | Jason    | Hum@nhrm123 |









    # HOOKS : for defining pre and Post steps in any Cucumber framework
    # HOOKS :  this is always created inside the StepDefinitions folder
    #       :  this class cannot be inherited
     # hooks will take care of pre and post conditions irrespective of what

  # Scenario Outline :
    # Provides you on alternative to data driven testing
    # also supports Parametrization

  #-------------------------------PARAMETRIZATION--------------------------
  # executing  the same test case with multiple data

  # if you want use parametrization
  # if you wish to implement data driven testing
  # Scenario outline is always used along with the keyword 'Examples'


