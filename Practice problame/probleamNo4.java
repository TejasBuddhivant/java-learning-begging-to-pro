// find the sum of sqare of given number 
class problem_no4{
    // in this program i use the reverse number logic and get little help of internet to check all posibility create this program
    public static int reverse(int num){
    
        
        int count=0;
        while (num !=0) { 
        
        int rem= num%10;
        if (rem == 2) {
           count++; 
        }
        num/=10;
        }
        return count;
    }
public static void main(String arr[]){

int num1= reverse(21);

System.out.println(num1);

}
}
