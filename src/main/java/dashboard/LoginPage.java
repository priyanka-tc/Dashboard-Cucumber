package dashboard;


import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPage extends AbstractPage{
	public String arg1;
	public  String splitchar;
	
	
	public  static void login(boolean isLogged){
		
		if(isLogged){
			return;}
		
		try{	



			
			getObject(OR.getProperty("login_Button")).click();

			driver.findElement(By.xpath(OR.getProperty("login_Button"))).click();
			//getObject(OR.getProperty("login_Button")).click();

			getObject(OR.getProperty("userName_textBox")).sendKeys("poneill");
			getObject(OR.getProperty("password_textBox")).sendKeys("pass");
			getObject(OR.getProperty("login_Button")).click();

		}
		catch(Throwable t){
			System.err.print("");
			
		}}
	
	
	public void enter_username(String arg1){
		WebElement actual=getObject(OR.getProperty("userName_textBox"));
		actual.sendKeys(arg1);
		//System.out.println("actual string "+ arg1);
	
		
		
		
		//return arg1;
		
	}
	public void enter_password(String arg1){

		getObject(OR.getProperty("password_textBox")).sendKeys(arg1);driver.findElement(By.xpath(OR.getProperty("login_Button"))).click();
	}
	public void testlogin(){
		
	}
	
/*public void store_loggedusername(){
	WebElement str=driver.findElement(By.xpath(OR.getProperty("logged_user")));
	String user =str.getText();
	String splitchar=user.substring(7, 14);
	Assert.assertEquals(arg1, splitchar);
	System.out.println(splitchar);*/
	
	
	//
	
	
	
	
	/*logged_username user= new Logged_username;
	String splitchar=str.substring(7, 13);
	
	String splitchar=str.substring(7, 13);
	*/
	
//}
	 /* String str="hello, poneill!";
	  String splitchar=str.substring(7, 13);
	  */
	 

	public void log_out() {
		getObject(OR.getProperty("click_on_log_out")).click();
		// TODO Auto-generated method stub
		

		getObject(OR.getProperty("password_textBox")).sendKeys(arg1);
		getObject(OR.getProperty("login_Button")).click();

	}
	
}


