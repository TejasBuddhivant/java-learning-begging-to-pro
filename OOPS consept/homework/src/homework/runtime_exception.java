package homework;

import java.util.Scanner;

public class runtime_exception {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	/*int a[]= new int[5];
	for(int i=0; i<a.length;i++) {
		a[i]= s.nextInt();
	}
	System.out.println("array index of fifth"+a[4]);*/
	
	//String a= "Tej as";
	//System.out.println(a.charAt(3));
	
	
    //String ab= null;
	//String bg= "Somnath =";
	//System.out.println("concating two strings"+bg.concat("Munja"));
	Object o=new String("Hello");
	Integer i=(Integer) o;
	
	String g="asd";
	int h=Integer.parseInt(g);
	System.out.println(i);
}
}
