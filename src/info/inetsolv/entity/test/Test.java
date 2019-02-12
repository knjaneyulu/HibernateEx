package info.inetsolv.entity.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Student st1=new Student("ANJI",45000d);
		Student st2=new Student("pessu",20000d);
		Student st3=new Student("mani",5000d);
//		List<Student> al=new ArrayList<Student>();
//		al.add(st1);
//		al.add(st2);
//		al.add(st3);
		
		
		Configuration config=new Configuration().configure();
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		org.hibernate.Transaction ts=session.beginTransaction();
		session.persist(st1);
		session.persist(st2);
		session.persist(st3);
		Student s=session.get(Student.class, 1);
		
		System.out.println(s.getName());
		ts.commit();
		session.close();
		sessionFactory.close();
	}
}
