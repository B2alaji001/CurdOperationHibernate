package com.deeptech.hibernate.work;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.deeptech.hibernate.wrok.dto.Student;
import com.deeptech.hibernate.wrok.utility.HibernateUtil;

public class CreateStudent 

{
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.setSudentName("Anusha");
		s.setRollNumber(12);
		s.setCourse("MCA");
		
		SessionFactory sf=HibernateUtil.connection();
		Session ses=sf.openSession();
		ses.beginTransaction();
		ses.save(s);
		System.out.println("Table Create Success and record insert success");
		ses.close();
		sf.close();
	}
}
