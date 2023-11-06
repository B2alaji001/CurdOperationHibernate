package com.deeptech.hibernate.work;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.deeptech.hibernate.wrok.dto.Student;
import com.deeptech.hibernate.wrok.utility.HibernateUtil;

public class DeleteStudent 
{
	public static void main(String[] args) 
	{
		SessionFactory sf=HibernateUtil.connection();
		Session ses=sf.openSession();
		ses.beginTransaction();
		
		Student s=ses.load(Student.class, 1);
		ses.delete(s);
		System.out.println("Record deleted sucessfully");
		ses.getTransaction().commit();
		sf.close();
		ses.close();
	}
}
