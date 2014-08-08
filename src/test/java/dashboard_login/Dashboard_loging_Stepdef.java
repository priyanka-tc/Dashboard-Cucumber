package dashboard_login;

import java.io.IOException;

import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import dashboard.AbstractPage;

public class Dashboard_loging_Stepdef {
	AbstractPage AP = new AbstractPage();
	
@Before
public void Open_browser() throws IOException {
	AP.initialize();
	
}

@Given("^I am on Dashboard log in page \"([^\"]*)\"$")
public void I_am_on_Dashboard_log_in_page(String arg1) {
    
}

@When("^I enter valid username poneill$")
public void I_enter_valid_username_poneill() {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@When("^I enter valid password pass$")
public void I_enter_valid_password_pass() {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Then("^It should land on Dashboard main page$")
public void It_should_land_on_Dashboard_main_page() {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@When("^I enter invalid username admin$")
public void I_enter_invalid_username_admin() {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@When("^I enter invalid password (\\d+)$")
public void I_enter_invalid_password(int arg1) {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Then("^It should give error message$")
public void It_should_give_error_message() {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}



}
