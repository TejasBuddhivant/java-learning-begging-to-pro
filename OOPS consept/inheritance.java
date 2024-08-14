//in this file we are learning the overriding method 
class inheritance{
final void display(){
System.out.println("HELLO WORLD");
}

}
class child extends inheritance{
void display(){
System.out.println("New world");

}
public static void main(String ae[]){
child tc= new child();
tc.display();
}

}