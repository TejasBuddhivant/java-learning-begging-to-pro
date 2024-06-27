import java.util.*;
public class holosquare {
    
    public static void main(String[] args) {
        int i,j,row;
        Scanner sc =new Scanner(System.in);
       row= sc.nextInt();
      
        for(i=1;i<=row;i++){
            for(j=1;j<=row;j++){
                if(i==1 || i==row || j==1 || j==row || i==j || i+j==row+1){
               System.out.print(" *");
                  
                }
                else{
                    System.out.print("  ");
                    }
            }
            System.out.println();
        }
    }

}
