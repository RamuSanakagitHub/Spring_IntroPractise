package com.STRSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestingClass 
{
	public static void main(String[] args) 
	{
		BeanFactory bFactory=new FileSystemXmlApplicationContext("C:\\Ramanji\\Eclipse workspace\\Core java Workspace\\Spring_IntroPractise\\beans.xml");
		Spring1_Demo demo =(Spring1_Demo)bFactory.getBean("sd1");
		System.out.println(demo);
		System.out.println(demo.getStid());
		System.out.println(demo.getStname());
		System.out.println(demo.getStSection());
		((AbstractApplicationContext) bFactory).close();
	}

}
