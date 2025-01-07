package test.test;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App
{
    public static void main( String[] args )
    {
		/*
		 * Configuration c= new Configuration(); SessionFactory f=
		 * c.configure().buildSessionFactory();
		 */ 
    	
		/*
		 * SessionFactory f = new Configuration().configure().buildSessionFactory();
		 * //Above line is use for creating connection between cfg file and cfg file
		 * connect to mySQL db
		 * 
		 * Session s= f.openSession();//this will start session between db and hibernet
		 * 
		 * s.beginTransaction(); //this is for begining transaction
		 * 
		 * 
		 * //this wil illustrate how to insert a data in the tabel simple way\|/
		 * 
		 * Student st= new Student();
		 * 
		 * //you can also get input from user and store on table via using scanner class
		 * object Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter roll no:"); st.setRollno(sc.nextInt());
		 * 
		 * System.out.println("Enter Name of student"); st.setSname(sc.next());
		 * 
		 * System.out.println("Enter Address of student"); st.setAddress(sc.next());
		 * 
		 * System.out.println("Enter Marks of student"); st.setPer(sc.nextDouble());
		 * 
		 * System.out.println("Enter Age of student"); st.setAge(sc.nextInt());
		 * 
		 * 
		 * s.save(st); s.getTransaction().commit(); f.close();
		 */
    	
    	
    	
    	SessionFactory f = new Configuration().configure().buildSessionFactory();
    	Session s=f.openSession();
    	s.beginTransaction();
    	
    	Student st= new Student();
    	
    	st.setSname("tejas");
    	st.setAge(19);
    	st.setAddress(new address_embeddable(412301,"zzz","pune","saswad"));
    	
    	s.save(st);
    	s.getTransaction().commit();
    	
    	
//there is a method are there that we can fetch the table data by using only get method and in this case i am writing it down because i write in cfg file create every time new table and insert that data that i give so...
    	
    	
    	Student student = s.get(Student.class, 1);
    	
    	System.out.println(student);
    	f.close();
    }
}
