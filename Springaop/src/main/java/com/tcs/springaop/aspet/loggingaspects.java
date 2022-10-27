package com.tcs.springaop.aspet;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class loggingaspects {
	@Before("execution(* com.tcs.springaop.Productserviceimpl.multiply(..))")
	public void logbefore(JoinPoint joinPoint) {
		System.out.println("before calling the method");
	}

	@After("execution(* com.tcs.springaop.Productserviceimpl.multiply(..))")
	public void logafter(JoinPoint joinPoint) {
		System.out.println("after method execute");
	}

}
