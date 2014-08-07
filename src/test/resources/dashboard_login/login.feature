Feature: Log In Page for Dashboard

  #As a registered user wants to log in to Dashboard tool
  Scenario Outline: Succesful Log in
    Given I am on Dashboard log in page "http://localhost:3000/#/signin"
    When I enter valid username <username>
    And I enter valid password <password>
    Then It should land on Dashboard main page

    Examples: 
      | username | password |
      | poneill  | pass     |

  Scenario Outline: Unsuccessful Log in
    Given I am on Dashboard log in page "http://localhost:3000/#/signin"
    When I enter invalid username <username>
    And I enter invalid password <password>
    Then It should give error message 

    Examples: 
      | username | password |
      | admin    | 123      |
