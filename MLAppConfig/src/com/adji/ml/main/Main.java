package com.adji.ml.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adji.ml.hero.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {

		System.out.println("\nJavaConfig:");
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(MainConfig.class);
		
		Hero hero1 = context.getBean("Mage", Hero.class);

		System.out.println("Hero Role: "+hero1.getRole());
		System.out.println("Hero Name: "+hero1.getName());
		System.out.println("Hero Race: "+hero1.getRace());
		System.out.println("Hero Age: "+hero1.getAge());
		context.close();

	}
}
