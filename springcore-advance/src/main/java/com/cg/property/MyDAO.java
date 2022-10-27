package com.cg.property;

public class MyDAO {
	private String dbServer;
	private String dbPort;
	private String dbUser;
	private String dbPass;

	public MyDAO(String dbServer,String dbPort,String dbUser,String dbPass) {
		super();
		this.dbServer = dbServer;
		this.dbPort=dbPort;
		this.dbUser=dbUser;
		this.dbPass=dbPass;
	}

	@Override
	public String toString() {
		return "MyDAO [dbServer=" + dbServer + ", dbPort=" + dbPort + ", dbUser=" + dbUser + ", dbPass=" + dbPass + "]";
	}

		
	
	

}
