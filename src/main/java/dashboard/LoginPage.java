package dashboard;

import org.openqa.selenium.By;

public class LoginPage extends AbstractPage{
	
	public  static void login(boolean isLogged){
		
		if(isLogged){
			return;}
		
		try{	
			driver.findElement(By.xpath(OR.getProperty("login_Button"))).click();
			//getObject(OR.getProperty("login_Button")).click();
		}
		catch(Throwable t){
			System.err.print("");
			
		}}
	
	
	public void enter_username(String arg1){
		getObject(OR.getProperty("userName_textBox")).sendKeys(arg1);
	}
	public void enter_password(String arg1){
		getObject(OR.getProperty("password_textBox")).sendKeys(arg1);
	}
	public void testlogin(){
		driver.findElement(By.xpath(OR.getProperty("login_Button"))).click();
	}
	




}


