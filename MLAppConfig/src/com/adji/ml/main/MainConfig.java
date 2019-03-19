package com.adji.ml.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.adji.ml.hero.*;


	@Configuration
	@PropertySource("classpath:animal.properties")
	public class MainConfig {
		
		@Bean
		public Hero Mage(@Value("${Mage1.name}") String name,
				@Value("${Mage1.role}") String role,
				@Value("${Mage1.race}") String race,
				@Value("${Mage1.age}") int age
				) 
	{	
			
			Mage mage1 = new Mage(name,role, race, age);
			return mage1;
		}
	}
