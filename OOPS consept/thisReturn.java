class thisReturn{
void set(){
System.out.println("HELLO WORLD");
}
thisReturn numb(){
int a=69;
System.out.println(a);
return this;
}
void get(){
System.out.println("LUCK");
}
public static void main(String... aa){
thisReturn th= new thisReturn();
th.set();
new thisReturn().numb().get();
}

}