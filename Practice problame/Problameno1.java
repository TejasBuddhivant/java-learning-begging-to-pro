class Problameno1{
    //write a java program/method  to display average of three numbers 

    // it take less space as compare to second method 
  int a=34,b=89,c=76;
  int result=(a+b+c)/3;//this is the formula for calculating the average
 

  //this is another method which is more take space

    // void averrage(int a, int b, int c){
    //   int result=(a+b+c)/3;
    //   System.out.println(result);
    // }
    public static void main(String arr[]){
      Problameno1 se=new Problameno1();
       System.out.println("Average of three numbers is :");
      //  averrage(24, 45, 78);
      System.out.println(se.result);
    }
}
    