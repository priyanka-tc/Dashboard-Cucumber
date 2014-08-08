package dashboard;
public class LoginPage extends AbstractPage{
	
	public  static void login(boolean isLogged){
		
		if(isLogged){
			return;}
		
		try{	
<<<<<<< HEAD
			
			getObject(OR.getProperty("login_Button")).click();
=======
<<<<<<< HEAD
			driver.findElement(By.xpath(OR.getProperty("login_Button"))).click();
			//getObject(OR.getProperty("login_Button")).click();
=======
			getObject(OR.getProperty("userName_textBox")).sendKeys("poneill");
			getObject(OR.getProperty("password_textBox")).sendKeys("pass");
			getObject(OR.getProperty("login_Button")).click();
>>>>>>> fcaa3c9b95f387919ef921cfccca0b549f729492
>>>>>>> c4047ae4a7764ee1ac532ca09ec64e5cd00e25cc
		}
		catch(Throwable t){
			System.err.print("");
			
		}}
	
	
	public void enter_username(String arg1){
		getObject(OR.getProperty("userName_textBox")).sendKeys(arg1);
	}
	public void enter_password(String arg1){
		getObject(OR.getProperty("password_textBox")).sendKeys(arg1);
		getObject(OR.getProperty("login_Button")).click();
	}
	
}


