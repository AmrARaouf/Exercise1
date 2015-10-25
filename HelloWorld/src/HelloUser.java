
public class HelloUser {
	
	String userName;
	
	public HelloUser(String userName) {
		this.userName = userName;
	}
	
	public void greetUser() {
		System.out.println("Hi there, " + userName + ".");
	}

}
