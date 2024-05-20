Feature: Searching the employee


  Background:
    Then     user enter valid email and valid password
    And      click on login button
    When     user clicks on PIM option


  @smoke
  Scenario: Search Employee by ID
    #Given    open the browser and launch HRMS application
    #Then     user enter valid email and valid password
    #And      click on login button
    #When     user clicks on PIM option
    When     user enters valid employee id
    And      click on search button
    And      user see employee information is displayed
   # And      Close the browser

# Background: this is used to define all the common steps that multiple
  # scenarios have in same feature file, till the till flow is not broken


  @smoke
    Scenario: Search Employee by job Title
     # Given    open the browser and launch HRMS application
     # Then     user enter valid email and valid password
      #And      click on login button
      #When     user clicks on PIM option
      When     user select Job Title
      And      click on search button
      And      user see employee information is displayed
      #And      Close the browser


