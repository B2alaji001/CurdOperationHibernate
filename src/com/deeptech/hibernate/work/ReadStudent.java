package com.deeptech.hibernate.wrok;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;
import org.hibernate.Query;
import com.deeptech.hibernate.wrok.dto.Student;
import com.deeptech.hibernate.wrok.utility.HibernateUtil;

public class ReadStudent 
{
	public static void main(String[] args) 
	{
		SessionFactory sf=HibernateUtil.connection();
		Session ses=sf.openSession();
		ses.beginTransaction(); //performs DML operation(insert,select,update,delete)
		
		//Collection framework
		Query q = ses.createQuery("from Student");
		List<Student>st=q.list();
		for(Student s :st)
		{	System.out.println(s.getSudentName()+"\t"+s.getRollNumber()+"\t"+s.getCourse());
		}
        ses.getTransaction().commit();
	}
}
