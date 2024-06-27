class Reversepiramid{
public static void main(String... arr){
int i,j,row=5;
System.out.println("hello world");
for (i=0; i<row; i++)   
{  

for (j=row-i; j>1; j--)   
{  
  
System.out.print(" ");   
}

for (j=0; j<=i; j++ )   
{   
      
System.out.print(" *");   
}   

System.out.println("");
}

}
}