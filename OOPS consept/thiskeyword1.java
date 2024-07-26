class thiskeyword1{
//In this file i learn about this keyword and why we use it 
//this keyword is use for objecting refferance and we can
// call the instance veriable also like in the below example

int a;
String name;
void integreat(int a,String name)//in this parameter we get same name variable to get above instance variable we can use this keybord
{
this.a=a;
this.name=name;
}
void display(){
System.out.println(a+"  "+name);
}
public static void main(String arr[]){
thiskeyword1 tc= new thiskeyword1();
tc.integreat(4,"tejas");
tc.display();
}
}