package handoff;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import dashboard.HandoffPage;


public class Handoff_Step_Defs {
	HandoffPage ho=new HandoffPage();


@Given("^that a User lands on the Handoff section$")
public void that_a_User_lands_on_the_Handoff_section() {
	 ho.handoffLink();
}

@When("^I enter from date along with time \"([^\"]*)\" on Search component$")
public void I_enter_from_date_along_with_time_on_Search_component(String arg1) {
    ho.fromDateAndTime(arg1);
}

@When("^I enter Until date along with time \"([^\"]*)\"$")
public void I_enter_Until_date_along_with_time(String arg1) {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@When("^I search for results$")
public void I_search_for_results() {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Then("^it should display results according to search criteria$")
public void it_should_display_results_according_to_search_criteria() {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}


}
