package tdd;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Testusername {
	
@Test
public void username(){
	Assert.assertEquals(true, usernamevalidator.isvalid("venkat"));
}
}
