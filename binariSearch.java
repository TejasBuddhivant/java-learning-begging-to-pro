import java.util.Scanner;

public class binariSearch {
    static void search(int key , int arr[]){
        int start= 0;
        int end= arr.length-1;
        while (start<=end) {
            int mid= (start+end)/2;
            if(arr[mid]==key){
                System.out.println("key is found "+mid);
                return;
            }
            else if(key>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        
            System.out.println("key is not found");

    }
    public static void main(String arg[]){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the number you want to search");
        int key = sc.nextInt();
        search(key,arr);
    }
}
