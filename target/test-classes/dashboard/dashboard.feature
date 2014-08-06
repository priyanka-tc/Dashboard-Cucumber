Feature: Dashboard Main page

  #As a Checkout Test Analyst
  #I want to verify the dashboard main page links
  #so that dashboard links works as expected
  Scenario Outline: Dashboard Main Page Links
    Background: checking all main page links

    Given I am on Dashboard landing page "http://localhost:3000"
    And I logged in successfully
    When I Click on any links in the main page <Main_Page_Links>
    Then it should navigate corresponding section <Expected_Links>

    Examples: 
      | Main_Page_Links | Expected_Links                   |
      | Home            | http://localhost:3000/#/         |
      | Handoff (XML)   | http://localhost:3000/#/handoff  |
      | BAPI (JSON)     | http://localhost:3000/#/bapi     |
      | Provider (XML)  | http://localhost:3000/#/provider |
      | Journey         | http://localhost:3000/#/journey  |
      | Admin           | http://localhost:3000/#/admin    |
