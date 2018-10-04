package tdd;

public class Passwordvalidator {

	public static Object isvalid(String pwd) {
		// TODO Auto-generated method stub
		if(pwd.length() == 5)
		{
			return true;
		}
		else
			return false;
	}

}
