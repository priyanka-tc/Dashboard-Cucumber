package dashboard;

public class LoginPage extends AbstractPage{
	
	public  static void login(boolean isLogged){
		
		if(isLogged){
			return;}
		try{	
			getObject(OR.getProperty("userName_textBox")).sendKeys("poneill");
			getObject(OR.getProperty("password_textBox")).sendKeys("pass");
			getObject(OR.getProperty("login_Button")).click();
		}
		catch(Throwable t){
			System.err.print("");
			
		}
	}}


