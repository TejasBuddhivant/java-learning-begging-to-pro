//super keyword calling the class methods 
class first{
void a(){
System.out.println("TEJAS");
}
}
class second extends first{
void a(){
System.out.println("GB");
}
void display(){
super.a();
a();
}
public static void main(String... arr){
second nd= new second();
nd.display();
}
}