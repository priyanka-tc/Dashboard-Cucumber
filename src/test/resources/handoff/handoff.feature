Feature: Dashboard Handoff

  #As a User
  #I would like to view the Handoff section on the Dashboard application
  #so that I can easily and quickly see the handoffs XMLs and filter them out by different options.
  Scenario Outline: Handoff section search and results components
    Given that a User lands on the Handoff section
    When I enter from date along with time <from_date_time> on Search component
    And I enter Until date along with time <until_date_time>
    And I search for results
    Then it should display results according to search criteria

    Examples: 
      | from_date_time                                          | until_date_time                                         |
      | "Tue Jul 01 2014 00:00:00 GMT+0100 (GMT Daylight Time)" | "Thu Aug 07 2014 00:00:00 GMT+0100 (GMT Daylight Time)" |
