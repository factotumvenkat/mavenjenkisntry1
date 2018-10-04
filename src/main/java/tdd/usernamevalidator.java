package tdd;

public class usernamevalidator {

	public static Object isvalid(String username) {
		// TODO Auto-generated method stub
		if(username.length()>5 &&username.length()<10) {
			return true;}
		else 
		return false;
	}

}
