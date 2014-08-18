package dashboard;

import junit.framework.Assert;

import org.openqa.selenium.WebElement;

public class HandoffPage extends AbstractPage {
	AbstractPage ap=new AbstractPage();
	public String actualDate;
	public String expectedDate;
	public String expected;
	public void handoffLink(){
		getObject(OR.getProperty("navi_Link1")+2+OR.getProperty("navi_Link2")).click();
	}

	public String fromDateAndTime(String date) {
		WebElement fromDateTime=getObject(OR.getProperty("from_date_Input_TextBox"));
		fromDateTime.clear();
		fromDateTime.sendKeys(date);
		expectedDate=date.substring(4, 7);
		System.out.println("expected date is "+ expectedDate);
		return expectedDate;
		
		
	}

	public void utillDateAndTime(String arg1) {
		WebElement untilDateTime=getObject(OR.getProperty("until_date_Input_TextBox"));
		
		untilDateTime.clear();
		untilDateTime.sendKeys(arg1);
		
	}

	public void click_on_search_btn() throws InterruptedException {
		getObject(OR.getProperty("click_search_button")).click();
		Thread.sleep(3000);
		
		
	}

	public void click_BookingRef() {
		getObject(OR.getProperty("click_bookingRef_button")).click();
		
	}

	public String enter_BookingRefNo(String arg1) {
		WebElement bookRef=getObject(OR.getProperty("enter_bookingRef_into_textBox"));
		bookRef.clear();
		bookRef.sendKeys(arg1);
		expected=arg1;
		System.out.println("expected is "+ expected);
		return expected;
		
	}

	public String searchResults()   {
		
		String date=getObject(OR.getProperty("search_results_date")).getText();
		actualDate=date.substring(0, 3);
		System.out.println("actual date is "+actualDate);
		return actualDate;
		
		
	}

	public void searhBookingRefResults() {
		ap.substring("booking_ref_table_1st_Element", 0,8);
		
		
		
	}

}