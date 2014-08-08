package dashboard;

import org.openqa.selenium.WebElement;

public class HandoffPage extends AbstractPage {
	public void handoffLink(){
		getObject(OR.getProperty("navi_Link1")+2+OR.getProperty("navi_Link2")).click();
	}

	public void fromDateAndTime(String date) {
		WebElement dateTime=getObject(OR.getProperty("date_Input_TextBox"));
		
		dateTime.clear();
		dateTime.sendKeys(date);
		
	}

}