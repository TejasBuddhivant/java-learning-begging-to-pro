class Vari{
int glob= 45;
static int glob2= 30;
void Newmet(){
String hello="Hello world";
System.out.println(hello.toLowerCase());

}
public  static void main(String arr[]){
Vari r = new Vari();

int normal =444;

System.out.println("normal int variable "+normal);
System.out.println("static int global variable "+glob2);
System.out.println("object  int global variable "+r.glob);
r.Newmet();

}
}