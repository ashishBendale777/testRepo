package com.kratika.kratika;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SessionUtil {
		private static SessionUtil instance=new SessionUtil();
		SessionFactory factory;
		public static SessionUtil getInstance()
		{
			return instance;
		}
		private SessionUtil()
		{
			Configuration configuration=new Configuration();
			configuration.configure("hibernate.cfg.xml");
			ServiceRegistry registry=new StandardServiceRegistryBuilder().
					applySettings(configuration.getProperties()).build();
			factory=configuration.buildSessionFactory(registry);
		}
		
		public static  Session getSession()
		{
			Session session=getInstance().factory.openSession();
			return session;
		}




	}
