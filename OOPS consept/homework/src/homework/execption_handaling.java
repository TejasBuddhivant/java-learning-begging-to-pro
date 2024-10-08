package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class execption_handaling {
public static void main(String[] args) {
	int a,b;
	Scanner s= new Scanner(System.in);
	
	System.out.println("Enter two two number");
	try {
	a=s.nextInt();
	b=s.nextInt();
	System.out.println("division is :"+(a/b));
	}
	catch(InputMismatchException | ArithmeticException e) {
		e.printStackTrace();
	}
	System.out.println("hello world");
	}
}

