package com.deeptech.hibernate.wor.utility;
package com.deeptech.hibernate.wrok.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateUtil 
{
	public static SessionFactory sessionfactory ;
}
	static
	{
		sessionfactory =new Configuration().configure().buildSessionFactory();
	}
	public static SessionFactory connection()
	{
		return sessionfactory;
	}
}


