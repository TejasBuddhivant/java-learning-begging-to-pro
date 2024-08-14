// now i am learning about the hierarchical inheritance and it is like the father having two child and the father give all them sem properties them have


class father{
int a=20;
String b="hello world";
}
class child1 extends father {
void disp(){
System.out.println(a+"  "+b);
}
}

class child2 extends father {
void display(){
System.out.println(a+"  "+b);
}
}

class mainclass{
public static void main(String... arr){
child2 t1= new child2();
child1 t2= new child1();
t1.display();
t2.disp();
}
}
