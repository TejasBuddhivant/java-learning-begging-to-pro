class staticex2{
int count=0;
//static int count=0;
void count1(){
count++;
System.out.println(count);
}
public static void main(String... ar){
staticex2 th= new staticex2();
staticex2 th1= new staticex2();
staticex2 th2= new staticex2();
th.count1();
th1.count1();
th2.count1();
}
}