//print all even number within range 1-50
//print all odd number within range 1-50
//print sum of all even number with in range 1-50
//print sum of square of all even numbers within range 1-50


class loops{

static void evenodd(){
int i;
for(i=0;i<=50;i++){
if(i%2==0){
System.out.println("even numbers are follow = "+i);

}
}
int sum;
sum+=i;
for(i=0;i<=50;i++){
if(i%2!=0){
System.out.println("odd numbers are "+i);
}
}
System.out.println("Sum of all even numbers: "+sum);

}
public static void main(String arg[]){
evenodd();
}
}