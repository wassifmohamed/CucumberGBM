Feature: Login Functionalities


  @testcase1
    Scenario:  Valid Admin Login
      Given    open the browser and launch HRMS application
      Then     user enter valid email and valid password
      And      click on login button
      Then     user is logged in successfully
      And      Close the browser


