package dashboard;

import org.openqa.selenium.By;

public class LoginPage extends AbstractPage{
	
	public  static void login(boolean isLogged){
		
		if(isLogged){
			return;}
		
		try{	
<<<<<<< HEAD
			driver.findElement(By.xpath(OR.getProperty("login_Button"))).click();
			//getObject(OR.getProperty("login_Button")).click();
=======
			getObject(OR.getProperty("userName_textBox")).sendKeys("poneill");
			getObject(OR.getProperty("password_textBox")).sendKeys("pass");
			getObject(OR.getProperty("login_Button")).click();
>>>>>>> fcaa3c9b95f387919ef921cfccca0b549f729492
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


