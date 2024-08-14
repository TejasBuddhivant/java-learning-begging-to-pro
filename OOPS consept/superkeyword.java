class superkeyword{
int a=20;
void ad(){
System.out.println("HEllO world");
}
}
class child extends superkeyword{
int a=30;
void ad(){
System.out.println("foook");
}
void display(){

ad();
super.ad();
System.out.println(a);
System.out.println(super.a);
}

}
class mainclass{
public static void main(String... ar){
child ed= new child();
ed.display();
}
}
