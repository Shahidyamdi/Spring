package com.tcs.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("com")
public class ConfigData {
	@Value("${ip}")
	String ip;

	@Value("${port}")
	int port;

	@Value("${username}")
	String username;

	@Value("${password}")
	String password;

	@Override
	public String toString() {
		return "ConfigData [ip=" + ip + ", port=" + port + ", username=" + username + ", password=" + password + "]";
	}

}
