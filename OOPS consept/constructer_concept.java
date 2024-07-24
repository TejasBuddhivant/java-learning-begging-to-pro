class concept{
//today i learn about constructor and in the php i learn how to //build constructor -- this sign but in the java we have to build //with class name 
concept(int r){//this is the example of constructor
String b = "Tejas ";
int a=r;
System.out.println(a+" "+b);
}
concept(int y, String t){
System.out.println("HELLO WORLD "+y+t);
}
public static void main(String arr[]){
concept se= new concept(7,"TEJAS");

}
}