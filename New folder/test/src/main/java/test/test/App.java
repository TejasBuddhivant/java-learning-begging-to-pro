package test.test;

import java.util.Scanner;
import test.test.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
		/*
		 * SessionFactory f = new Configuration().configure().buildSessionFactory();
		 * Session s= f.openSession(); s.beginTransaction();
		 * 
		 * Scanner see= new Scanner(System.in);
		 * 
		 * student st = new student(); System.out.println("Enter roll no");
		 * st.setRoll(see.nextInt());
		 * 
		 * System.out.println("Enter name"); st.setName(see.next());
		 * 
		 * System.out.println("Enter add"); st.setAddress(see.next());
		 * 
		 * System.out.println("Enter Percentage"); st.setPercentage(see.nextDouble());
		 * 
		 * System.out.println("Enter Age"); st.setAge(see.nextInt());
		 * 
		 * s.save(st);
		 * 
		 * s.getTransaction().commit(); f.close();
		 */
     
    	SessionFactory f= new Configuration().configure().buildSessionFactory();
    	Session s=f.openSession();
    	s.beginTransaction();
    	
    	Student1 st = new Studnet1();
    	st.setName("asd");
    	st.setPercentage(76.30);
    	st.setAddress(412301,"saswad","pune");
    	
    	s.save(st);
    	s.getTransaction().commit();
    	f.close();
 
      
    }
}
