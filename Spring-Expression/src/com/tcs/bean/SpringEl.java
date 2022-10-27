package com.tcs.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("spel")
public class SpringEl {
	@Value("100")
	private int x;

	@Value("#{10+20+30}")
	private int y;
	
	@Value("#{10>20 && 30<40?100:200}")
	private int z;

	@Value("#{2 > 1 ? 'a' : 'b'}") 
	String d;

	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int value;
	
	@Value("#{T(java.lang.Math).PI}")
	private float pivalue;

	@Value("#{T(com.tcs.bean.Demo).getData(20)}")
	private int i;

	@Value("#{new String('ratan')}")
	private String name;

	@Override
	public String toString() {
		return "SpringEl [x=" + x + ", y=" + y + ", z=" + z + ", d=" + d + ", value=" + value + ", pivalue=" + pivalue
				+ ", i=" + i + ", name=" + name + "]";
	}


}
