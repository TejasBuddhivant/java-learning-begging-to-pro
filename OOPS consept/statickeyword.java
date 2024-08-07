class statickeyword{
int a;
String name;
static String clgname = "A.M.College";

statickeyword(int no,String sname){
this.a=no;
this.name=sname;
}

void display(){
System.out.println("no of student is "+a);
System.out.println("name of student is "+name);
System.out.println("college of student is "+clgname);
System.out.println();
}
public static void main(String... ar){
statickeyword th=new statickeyword(12,"TEJAS");
statickeyword th1=new statickeyword(13,"somnath");
statickeyword th2=new statickeyword(15,"Kunal");
statickeyword th3=new statickeyword(14,"Yogesh");
th.display();
th1.display();
th2.display();
th3.display();
}
}