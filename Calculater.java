class Calculater{
int num2,num1,  result;
void add(){
num1=39;
num2=29;
result= num1 + num2;
System.out.println("addition = "+result);
}
void sub(){
num1= 3;
num2=2;

result= num1 - num2;
System.out.println("Subtraction= "+result);
}
void mul(){
num1=30;
num2=2;
result= num1 * num2;
System.out.println("Multiplication ="+result);
}
void div(){
num1= 2;
num2=8;
result= num1 / num2;
System.out.println("Division ="+result);
}

void mod(){
num1= 23;
num2= 34;

result= num1 % num2;
System.out.println("Moduler ="+result);
}
public static void main(String... arr){
Calculater v= new Calculater();
int a,b;
v.add();
v.sub();
v.mul();
v.div();
v.mod();
}
}