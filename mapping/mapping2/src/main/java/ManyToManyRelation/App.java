package ManyToManyRelation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
	     Configuration c= new Configuration().configure();
	     
	     SessionFactory Factory = c.buildSessionFactory();
	     
	     //we are creating the first class obj to store the question
	     
	     FirstClass question1= new FirstClass();
	     question1.setQuestionId(0);
	     question1.setQuestions("HEY you, What's your name");
	     
	     
	     SecondClass Answer1= new SecondClass();
	     Answer1.setAnswerId(132);
	     Answer1.setAnswers("My Name is Tejas ");
	    
	     
	     Session s= Factory.openSession();
	     Transaction tx =s.beginTransaction();
	     
	     //saveing the three tables 
	     s.save(question1);
	     s.save(Answer1);
	
	     
	     //commiting the transaction
	     
	     tx.commit();
	     
	     //closing the session
	     s.close();
	     Factory.close();
	}
}
