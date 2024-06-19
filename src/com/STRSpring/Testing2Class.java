package com.STRSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Testing2Class
{
	public static void main(String[] args) 
	{
	 BeanFactory bFactory=new FileSystemXmlApplicationContext("C:\\Ramanji\\Eclipse workspace\\Core java Workspace\\Spring_IntroPractise\\beans.xml");
		EmployeeSpring es =(EmployeeSpring)bFactory.getBean("se");
//		System.out.println(es);
		System.out.println(es.getEmpName());
		System.out.println(es.getEmpId());
		((AbstractApplicationContext) bFactory).close();
				
		
	}

}
