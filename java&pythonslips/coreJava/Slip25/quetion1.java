import java.util.Scanner;
public class Slip25A {

    public static void main(String args[]){

        int i=0,h=0;
        Scanner scan=new Scanner(System.in);

        try {

            System.out.print("Enter String : ");

            String str = scan.nextLine();

            int j= str.length()-1;

            while(i<j){

                if(str.charAt(i++) != str.charAt(j--)){

                   h = h + i ;

                }

            }

           if(h>0){

               System.out.println("String is not palindrome");

           }else{

                System.out.println("String is palindrome");

           }

        } catch (Exception e) {}

    }

} 