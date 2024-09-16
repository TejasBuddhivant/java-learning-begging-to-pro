package homework;
// write a program for wheather the user is eligible for voting or not
import java.util.Scanner;
public class ProbleamNo1 {
public static void main(String...arr) {
	System.out.println("Enter your age");
	Scanner sc= new Scanner(System.in);
	
	int age= sc.nextInt();
	if(age>=18) {
		
		System.out.println("Your eligible for voteing");
	}
	else {
		System.out.println("Your not eligible for voting!!!");
	}
}
}
