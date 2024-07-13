class LoopsConcepts{
public static void main(String arr[]){
//creating program for reverse number
int i, num=303, rev=0, rem;
while(num != 0){
rem= num%10;
rev= rev*10+rem;
num= num/10;
}
System.out.println("Reverse number = "+rev);
if(num==rev){
System.out.println("this is Palindrome Number");
}
else{
System.out.println("this is not Palindrome Number");
}
}
}