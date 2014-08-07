package dashboard;
import org.openqa.selenium.WebElement;

public class DashboardMainPage extends AbstractPage {
	public String actual;
	
	public void navigationLinks(int i) throws InterruptedException{
		//for(int i=1; i<=6; i++){
		
			WebElement navLinks =getObject(OR.getProperty("navi_Link1") + i+ OR.getProperty("navi_Link2"));
			System.out.println(navLinks.getText());
			navLinks.click();
			Thread.sleep(2000);
			actual=driver.getCurrentUrl();
			System.out.println("Actual" +actual);
					
	}

}
