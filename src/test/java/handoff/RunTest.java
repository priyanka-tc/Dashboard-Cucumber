package handoff;

import java.io.IOException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;
import dashboard.AbstractPage;
import dashboard.LoginPage;

@RunWith(Cucumber.class)
@Cucumber.Options(features="handoff/handoff.feature",
format= {"json:target/cucumber.json"})

public class RunTest {
	static AbstractPage ap= new AbstractPage();
	
	@BeforeClass
	public static void openBrowser() throws IOException{
		ap.initialize();
		ap.lanchBrowser();
		LoginPage.login(false);
		
	}
	@AfterClass
	public static void closeBrowser(){
		//ap.closeBrowser();
	}
}
