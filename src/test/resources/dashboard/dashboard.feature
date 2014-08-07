Feature: Dashboard Main page

  #As a Checkout Test Analyst
  #I want to verify the dashboard main page links
  #so that dashboard links works as expected
  Scenario Outline: Dashboard Main Page Links
    Background: checking all main page links

    Given I am on Dashboard landing page "http://localhost:3000"
    And I logged in successfully
    When I Click on any links in the main page <SL_NO><Main_Page_Links>
    Then it should navigate corresponding section <Expected_Links>

    Examples: 
      | SL_NO | Main_Page_Links  | Expected_Links                     |
      | 1     | "Home"           | "http://localhost:3000/#/"         |
      | 2     | "Handoff (XML)"  | "http://localhost:3000/#/handoff"  |
      | 3     | "BAPI (JSON)"    | "http://localhost:3000/#/bapi"     |
      | 4     | "Provider (XML)" | "http://localhost:3000/#/provider" |
      | 5     | "Journey"        | "http://localhost:3000/#/journey"  |
      | 6     | "Admin"          | "http://localhost:3000/#/admin"    |
