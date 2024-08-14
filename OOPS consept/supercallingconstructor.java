class first{
first(){
System.out.println("HELLO");
}
}
class sec extends first{

sec (){
super();
System.out.println("WORLD");

}
public static void main(String... arr){
sec tc=new sec();

}
}