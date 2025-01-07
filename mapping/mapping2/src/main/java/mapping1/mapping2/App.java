package mapping1.mapping2;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import OneToOneMapping.TableNo1;
import OneToOneMapping.TableNo2;


public class App 
{
    public static void main( String[] args )
    {
      
    	Configuration c=new Configuration().configure();
    			
    	
    	SessionFactory factory = c.buildSessionFactory();
    	
    	TableNo1 questions = new TableNo1();
    	
    	questions.setRollno(0);
    	questions.setName("what is your name");
    	
    	
    	//for giving answer we create first tableno2 object ;
    	
    	TableNo2 answers = new TableNo2();
    	
    	answers.setAnswerId(123);
    	answers.setAnswers("my name is Tejas");
    	answers.setQuestionNo(questions);
    	
    	questions.setAnswerId(answers);
    	
        // session
        Session s =factory.openSession();
    	
    	Transaction tx = s.beginTransaction();
    	
    	//save
        s.save(questions);
    	s.save(answers);
    	
    	
    	tx.commit();
    	s.close();
    	factory.close();
 
    	
    	
    }
}
