Feature: Dashboard Handoff
#As a developer
#I would like to view the Handoff section on the Dashboard application
#so that I can easily and quickly see the handoffs XMLs and filter them out by different options.

Scenario: Handoff section firstly uploaded
Given that a User lands on the Handoff section
When the Handoff section is firstly uploaded
Then the dates are populated with the current date
And the time range is populated from 0:00 a.m. to current time + 1 hour 
And the rest of the filters remain without being populated
And the developer is presented on the Handoff section with the list of results for the page 0 whose creation/check-in date is between the defaulted date range
And the Handoff link of the main page is highlighted.