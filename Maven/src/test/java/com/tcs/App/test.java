package com.tcs.App;

import java.io.IOException;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class test {
	@Test
	public void loginuserA() throws IOException
	{
		Apps app =new Apps();
		
		Assert.assertEquals(0, app.userLogin("Ratan", "Ratan@123"));
		
		
		
	}
	
	@Test
	public void loginUserB() throws IOException 
	{
		
		
			Apps app = new Apps();
			Assert.assertEquals(1, app.userLogin("Rataan", "Ratan@123"));
	}

}
