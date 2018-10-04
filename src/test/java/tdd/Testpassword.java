package tdd;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Testpassword {
@Test
public void passwordvalidate()
{
	Assert.assertEquals(true, Passwordvalidator.isvalid("aeioy"));
}
}
