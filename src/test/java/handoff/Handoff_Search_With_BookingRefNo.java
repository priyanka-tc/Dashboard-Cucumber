package handoff;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import dashboard.HandoffPage;

public class Handoff_Search_With_BookingRefNo {
	HandoffPage ho=new HandoffPage();
	
	@When("^I click on Booking ref button$")
	public void I_click_on_Booking_ref_button() {
	   ho.click_BookingRef();
	   }
	

	@When("^I enter booking ref number in to textbox \"([^\"]*)\"$")
	public void I_enter_booking_ref_number_in_to_textbox(String arg1) {
	   ho.enter_BookingRefNo(arg1);
	}

	@When("^I click on search button$")
	public void I_click_on_search_button() throws InterruptedException {
	 ho.searchResults();  
	}

	@Then("^it should display results according to booking ref no$")
	public void it_should_display_results_according_to_booking_ref_no() {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}



}
