class problemNo5{
public static void main(String arr[]){
int n1=25, n2= 37, n3=2;
if(n1<n2 && n1<n3){
System.out.println("num1 is smallest");
}
else if(n2<n1 && n2<n3){
System.out.println("num2 is smallest");
}
else if(n3<n2 && n3<n1){
System.out.println("num3 is smallest");
}
else{
System.out.println("error");
}

}
}