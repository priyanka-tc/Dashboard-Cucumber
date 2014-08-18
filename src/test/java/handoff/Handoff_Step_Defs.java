package handoff;

import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import dashboard.AbstractPage;
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
   ho.utillDateAndTime(arg1);
}

@When("^I search for results$")
public void I_search_for_results() throws InterruptedException {
    ho.click_on_search_btn();
}

@Then("^it should display results according to search criteria$")
public void it_should_display_results_according_to_search_criteria() {
ho.searchResults();
Assert.assertEquals(ho.expectedDate, ho.actualDate);
	

	
    
}


}
