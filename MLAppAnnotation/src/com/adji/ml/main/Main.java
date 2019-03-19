package com.adji.ml.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adji.ml.hero.*;

public class Main {
	public static void main(String[] args) {

		System.out.println("\nAnnotation:");
		ClassPathXmlApplicationContext context = 
		new ClassPathXmlApplicationContext("HeroAnnotationConfig.xml");
	
		Hero hero1 = context.getBean("mage", Hero.class);

		System.out.println("Hero Role: "+hero1.getRole());
		System.out.println("Hero Name: "+hero1.getName());
		System.out.println("Hero Race: "+hero1.getRace());
		System.out.println("Hero Age: "+hero1.getAge());
		context.close();

	}
}
