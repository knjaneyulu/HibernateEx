package info.inetsolv.test;

import java.util.ArrayList;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import info.inetsolv.entity.Course;
import info.inetsolv.entity.Student;

public class App {

	public static void main(String[] args) {
		Student st=new Student();
		st.setSname("ANJI");
		
		Course c=new Course();
		c.setCname("JAVA");
		
		Course c1=new Course();
		c1.setCname("DB");
		
		ArrayList<Student> stuList=new ArrayList<Student>();
		stuList.add(st);
		c.setStudenttbls(stuList);
		c1.setStudenttbls(stuList);
		
		ArrayList<Course> courseList=new ArrayList<Course>();
		courseList.add(c);
		courseList.add(c1);
		st.setCourse(courseList);
		
		Configuration configuration=new Configuration().configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		org.hibernate.Transaction ts=session.beginTransaction();
		session.persist(st);
		ts.commit();
		session.close();
		sessionFactory.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
