package com.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {

	//used to create session
	public static SessionFactory factory;

	public static SessionFactory getFactory() {
		
		//if it is null it will create factory and if not then it will use old one
		if (factory == null) {	
			//creating factory
			factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}

		return factory;
	}

	public void closeFactory() {
		
		//to close the session
		if (factory.isOpen()) {
			factory.close();
		}
	}
}
