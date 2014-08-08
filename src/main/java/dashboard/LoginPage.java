package dashboard;
public class LoginPage extends AbstractPage{
	
	public  static void login(boolean isLogged){
		
		if(isLogged){
			return;}
		
		try{	
			
			getObject(OR.getProperty("login_Button")).click();
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


