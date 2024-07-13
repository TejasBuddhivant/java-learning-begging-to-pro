class Problameno2{
    public static void main(String...arr){
      String input="Tejas";
       input=input.toLowerCase();
      int count=0,i;

     for(i=0;i<input.length();i++){
        if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'){
            System.out.println("vowel found : "+input.charAt(i));
            count++;
        }
     }
      System.out.println("count:"+count);
    }
}