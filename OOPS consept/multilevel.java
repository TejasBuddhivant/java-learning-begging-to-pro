//we are now see the multilevel inheritance which simple as genrations like grandfather father and child 

class grandfather{
int a=10;

}
class father extends grandfather{
String b="I am father";
}
class child extends father{
String c="i am child";
public static void main(String... ar){
child tc= new child();
System.out.println(" the grandfather no is"+tc.a);
System.out.println(" the grandfather no is"+tc.b);
System.out.println(" the grandfather no is"+tc.c);
}
}
