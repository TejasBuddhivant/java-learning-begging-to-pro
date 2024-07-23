import java.util.Scanner;
class classobj{
int id;
String ename;
String design;
void insert(int i, String n,String d){
id = i;
ename= n;
design= d;
}
void display(){

System.out.println(id+" "+ename+" "+design);
}
public static void main(String... ae){
classobj n1=new classobj();
classobj n2=new classobj();
Scanner in= new Scanner(System.in);
int eid;
String ename;
String desig;
System.out.println("Enter the employee id then name");
eid = in.nextInt();
ename= in.next();
System.out.println("Enter the employee  designation");
desig= in.next();
n1.insert(eid,ename,desig);
System.out.println("Enter second  employee id then name");
eid = in.nextInt();
ename= in.next();
System.out.println("Enter the employee  designation");
desig= in.next();
n2.insert(eid,ename,desig);
System.out.println("ID  NAME  DESIGNATION");
n1.display();
n2.display();
}
}