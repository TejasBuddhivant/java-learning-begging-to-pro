package com.SpringCore.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/Collections/CollectionFrameworkconfig.xml");
	
	FamilyRecords member1 = (FamilyRecords) context.getBean("Member1");

	System.out.println(member1.getMemberName());
	System.out.println(member1.getMobileNo());
	System.out.println(member1.getTopenNames());
	System.out.println(member1.getOccupations());
	System.out.println(member1.getProper());
	}
}
