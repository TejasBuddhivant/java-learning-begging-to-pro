package coreSpring.coreSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import diwithcon.Addition;
import diwithsetter.Square;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        Addition add= context.getBean(Addition.class);
        System.out.println("Num1 is : "+add.getD().getNum1());
        System.out.println("Num2 is : "+add.getD().getNum2());
        
        System.out.println("ADD is :"+add.add());
//        Square s= context.getBean(Square.class);
//        System.out.println("Value of num is : "+s.getObj().getNum1());
//        System.out.println("Square of num is : "+s.sq());
        
		
    }
}
