
import java.util.Scanner;
public class Slip11A {
    public static void main(String args[]){
        int a,b,n;
System.out.println("Enter 1 : Additon" + '\n' + "Enter 2 : Substraction" + '\n' + "Enter 3 : Multiplication" + '\n' + "Enter 4 : Division");
        Scanner dr=new Scanner(System.in);
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            System.out.print("Enter Number : ");
            n = dr.nextInt();
            switch(n){
                case 1:  
                System.out.println(a + " + " + b + " = " + (a+b));
                break;
                case 2:  
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
                case 3:  
                System.out.println(a + " * " + b + " = " + (a*b));
                break;
                case 4:  
                System.out.println(a + " / " + b + " = " + (a/b));
                break;
            }
        } catch (Exception e) {}
    }
}
