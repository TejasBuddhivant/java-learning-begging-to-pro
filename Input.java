import java.util.*;
class test2{
public static void main(String a2r[]){
Scanner p= new Scanner(System.in);
System.out.println("Enter the employe name");
String ar= p.next();
System.out.println("Enter the ID");
int id= p.nextInt();

System.out.println("Enter gender");
String gender= p.next();

System.out.println("Enter Designation");
String Desig= p.next();
System.out.println("Emp Name : "+ar);
System.out.println("Emp ID : "+id);
System.out.println("Emp Gender : "+gender);
System.out.println("Emp Designation : "+Desig);
}
}

class Input{

public static void main(String arr[]){
Scanner sc= new Scanner(System.in);

System.out.println("Enter the name of student");
String name= sc.next();

System.out.println("Enter the name of Rollno");
int rollno= sc.nextInt();

System.out.println("Enter the name of Div");
String Div= sc.next();
System.out.println("name :"+name);
System.out.println("name :"+rollno);
System.out.println("name :"+Div);

}
}