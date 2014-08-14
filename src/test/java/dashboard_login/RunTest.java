package dashboard_login;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;
import dashboard.AbstractPage;


@RunWith(Cucumber.class)
@Cucumber.Options(features="dashboard_login/login.feature")
public class RunTest {
	static AbstractPage ap= new AbstractPage();
	
	@BeforeClass
	public static void openBrowser() throws IOException{
		ap.initialize();
		
	}
	@AfterClass
	public static void closeBrowser(){
		ap.closeBrowser();
	}


}
