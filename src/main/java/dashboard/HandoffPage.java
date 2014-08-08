package dashboard;

import org.openqa.selenium.WebElement;

public class HandoffPage extends AbstractPage {
	public void handoffLink(){
		getObject(OR.getProperty("navi_Link1")+2+OR.getProperty("navi_Link2")).click();
	}

	public void fromDateAndTime(String date) {
		WebElement fromDateTime=getObject(OR.getProperty("from_date_Input_TextBox"));
		
		fromDateTime.clear();
		fromDateTime.sendKeys(date);
		
	}

	public void utillDateAndTime(String arg1) {
		WebElement untilDateTime=getObject(OR.getProperty("until_date_Input_TextBox"));
		
		untilDateTime.clear();
		untilDateTime.sendKeys(arg1);
		
	}

	public void searchResults() throws InterruptedException {
		getObject(OR.getProperty("click_search_button")).click();
		Thread.sleep(2000);
		
	}

	public void click_BookingRef() {
		getObject(OR.getProperty("click_bookingRef_button")).click();
		
	}

	public void enter_BookingRefNo(String arg1) {
		getObject(OR.getProperty("enter_bookingRef_into_textBox")).sendKeys(arg1);
		
	}

}