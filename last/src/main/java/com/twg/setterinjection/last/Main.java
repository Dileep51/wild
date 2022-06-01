package com.twg.setterinjection.last;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String x[])
	{
		ApplicationContext c=new ClassPathXmlApplicationContext("last.xml");
		Rim r=(Rim) c.getBean("rim");
		r.rim();
		
		
		
	}
		
}
