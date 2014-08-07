package dashboard;

import java.io.IOException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="dashboard/dashboard.feature",
format= {"json:target/cucumber.json"})

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
