import java.util.Scanner;
class AuthenticationException extends Exception{
	public AuthenticationException(String err){
		super(err);
	}
}
public class Username {
	private static final String USER="sachu";
	private static final String PASS="pass123";
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		try{
			System.out.print("Enter username: ");
			String user=sc.nextLine();
			if(!USER.equals(user)){
				throw new AuthenticationException("Invalid username.");
			}
			System.out.print("Enter Password: ");
			String pass=sc.nextLine();
			if (!PASS.equals(pass)) {
				throw new AuthenticationException("Invalid password.");
			}
			System.out.println("Login successful!");
		}
		catch (AuthenticationException e){
			System.out.println("Login failed: " + e.getMessage());
		} 
		finally {
			sc.close();
		}
	}
}
