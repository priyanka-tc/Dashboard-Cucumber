package dashboard;
import org.openqa.selenium.WebElement;

public class DashboardMainPage extends AbstractPage {
	public String actual;
	
	public void navigationLinks(int i) throws InterruptedException{
		//for(int i=1; i<=6; i++){
		
			WebElement navLinks =getObject(OR.getProperty("navi_Link1") + i+ OR.getProperty("navi_Link2"));
			System.out.println(navLinks.getText());
			
			navLinks.click();
			
			
			String linkClass=navLinks.getAttribute("class");
			System.out.println("Class active or not : "+linkClass);
			//Thread.sleep(2000);
			actual=driver.getCurrentUrl();
			System.out.println("Actual" +actual);
			
			
			
			
		/*if ("active".equals(linkClass)) {
				   navLinks.click();
				   Thread.sleep(2000);
					actual=driver.getCurrentUrl();
					System.out.println("Actual" +actual);
				}*/
			
			
			/*WebElement link = driver.findElement(By.cssSelector("[title='No. 2']"));
			String linkClass = link.findElement(By.xpath("./..")).getAttribute("class");
			if ("active".equals(linkClass)) {
			   link.click();
			}
				*/	
	}

}
