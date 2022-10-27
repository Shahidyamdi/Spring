package com.tcs.App;

import java.io.IOException;
import java.util.ResourceBundle;

public class Apps {
	public int userLogin(String in_uname, String in_pwd) throws IOException {
		ResourceBundle rb = ResourceBundle.getBundle("config");

		String username = rb.getString("username");
		String pwd = rb.getString("pwd");

		if (in_uname.equals(username) && in_pwd.equals(pwd))
			return 0;
		else
			return 1;

	}
}
