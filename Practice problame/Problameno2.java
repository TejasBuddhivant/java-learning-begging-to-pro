class Problameno2{
  // Q2 make the program to find the vowels between the word or string 


  // this is program i learn from geeksforgeeks and i like this method to solve this problame and it is so simple to understad what is going on the program so creadit to geeksforgeeks 
    public static void main(String...arr){
      String input="Tejas";
       input=input.toLowerCase();//this function can make the string in lowercase we can use another condition in the if statement but program will be confusing and get big and big so...
      int count=0,i;

     for(i=0;i<input.length();i++){
        if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'){//in the if condition i learn about charat()it can convert string into arr and chek there value by index value and here we use for all word.
            System.out.println("vowel found : "+input.charAt(i));
            count++;
        }
     }
      System.out.println("count:"+count);//it will show how much time vowels are count in the word.
    }
}