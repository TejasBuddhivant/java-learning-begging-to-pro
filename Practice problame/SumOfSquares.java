// find the sum of sqare of given number 
class problem_no3{
    // in this program i use the reverse number logic and get little help of internet to check all posibility create this program
    public static int reverse(int num){
    
        int rev=0;
        while (num !=0) { 
        
        int rem= num%10;
        rev += rem*rem;
        num/=10;
        }
        return rev;
    }
public static void main(String arr[]){

int num1= reverse(25);

System.out.println(num1);

}
}
