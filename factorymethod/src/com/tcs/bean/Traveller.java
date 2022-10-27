package com.tcs.bean;

import java.util.Calendar;

public class Traveller {
	
	private Calendar dateTime;

	public Calendar getDateTime() {
		return dateTime;
	}

	public void setDateTime(Calendar dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "Traveller [dateTime=" + dateTime + "]";
	}
	

}
