package com.adji.ml.hero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
	public class Mage implements Hero{
		
		private String name;
		private String role="Mage";
		private String race;
		private int age;
		

		public Mage() {
			super();
		}
		
		@Autowired
		public Mage(@Value("${Mage1.name}") String name,
					@Value("${Mage1.role}") String role,
					@Value("${Mage1.race}") String race,
					@Value("${Mage1.age}") int age
					) 
		{		
			super();
			this.name = name;
			this.role = role;
			this.race = race;
			this.age = age;
		}
		////////////////////Spesies
		@Override
		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}
		////////////////////Name
		@Override
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		////////////////////
		@Override
		public String getRace() {
			return race;
		}

		public void setRace(String race) {
			this.race = race;
		}
		////////////////////
		@Override
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		////////////////////
		

	}
