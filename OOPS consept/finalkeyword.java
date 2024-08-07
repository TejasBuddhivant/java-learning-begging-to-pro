//today we learn about final keyword and this is the example of it
class finalkeyword{
final int k=10;
void display(){
//k=30;  we get the error that we cannot assign a value to final variable
System.out.println("final keyword value is ="+k);
}
public static void main(String arr[]){
finalkeyword tc= new finalkeyword();
tc.display();
}

}