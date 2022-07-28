package com.yash.aoimpl.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	@Before("execution(* com.yash.aopimpl.services.PaymentServiceImpl.makePayment())")
	public void printBefore() {
		System.out.println("Payment Initilaized");
	}

	@After("execution(* com.yash.aopimpl.services.PaymentServiceImpl.makePayment())")
	public void printAfter() {
		System.out.println("Payment Completed");
	}
}