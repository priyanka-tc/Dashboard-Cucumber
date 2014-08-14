package dashboard_login;

<<<<<<< HEAD
import java.io.IOException;

import junit.framework.Assert;
import cucumber.annotation.Before;
=======
>>>>>>> c44a8d22c296e5bd8be322f31893f82d8f56af72
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import dashboard.AbstractPage;
import dashboard.LoginPage;

public class Dashboard_loging_Stepdef {
	AbstractPage AP = new AbstractPage();
	LoginPage LP = new LoginPage();
	
	


@Given("^I am on Dashboard log in page \"([^\"]*)\"$")
public void I_am_on_Dashboard_log_in_page(String arg1) {
    AP.lanchBrowser();
}

<<<<<<< HEAD


=======
@Given("^I am on Dashboard log in page \"([^\"]*)\"$")
public void I_am_on_Dashboard_log_in_page(String arg1) {
    
>>>>>>> fcaa3c9b95f387919ef921cfccca0b549f729492
}
>>>>>>> c44a8d22c296e5bd8be322f31893f82d8f56af72
@When("^I enter valid username \"([^\"]*)\"$")
public void I_enter_valid_username(String arg1) {
	LP.enter_username(arg1);
   
}

@When("^I enter valid password \"([^\"]*)\"$")
public void I_enter_valid_password(String arg1) throws InterruptedException {
   LP.enter_password(arg1);
   Thread.sleep(2000);
}

@Then("^It should land on Dashboard main page$")
public void It_should_land_on_Dashboard_main_page() {
<<<<<<< HEAD
   	LP.testlogin();
	//LP.store_loggedusername();
=======
   LoginPage.login(false);

>>>>>>> c44a8d22c296e5bd8be322f31893f82d8f56af72
	
	
	
}

@When("^I click on Log out$")
public void I_click_on_Log_out() {
   LP.log_out();
   
    
}

@Then("^User should Log out$")
public void User_should_Log_out() {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@When("^I enter invalid username \"([^\"]*)\"$")
public void I_enter_invalid_username(String arg1) {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@When("^I enter invalid password \"([^\"]*)\"$")
public void I_enter_invalid_password(String arg1) {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Then("^It should give error message$")
public void It_should_give_error_message() {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}






}

