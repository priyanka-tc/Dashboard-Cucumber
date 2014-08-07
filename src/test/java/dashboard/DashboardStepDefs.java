package dashboard;

import junit.framework.Assert;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class DashboardStepDefs {
	AbstractPage ap= new AbstractPage();
	LoginPage lp=new LoginPage();
	DashboardMainPage db=new DashboardMainPage();

	
@Given("^I am on Dashboard landing page \"([^\"]*)\"$")
public void I_am_on_Dashboard_landing_page(String arg1) {
    ap.lanchBrowser();
}

@Given("^I logged in successfully$")
public void I_logged_in_successfully() {
    LoginPage.login(false);
    
}

@When("^I Click on any links in the main page (\\d+)\"([^\"]*)\"$")
public void I_Click_on_any_links_in_the_main_page(int arg1, String arg2) throws InterruptedException {
	
    db.navigationLinks(arg1);   
}

@Then("^it should navigate corresponding section \"([^\"]*)\"$")
public void it_should_navigate_corresponding_section(String arg1) {
	   Assert.assertEquals(arg1, db.actual);
	   System.out.println("Expected " +arg1);
	  
}

	
}
