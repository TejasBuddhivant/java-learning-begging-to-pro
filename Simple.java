import java.util.*;
class Simple
{
public static void main(String arg[])
{
/*
--helllo world printiing--
System.out.println("hello world");
int a= 13;
int b= 7;
int sum= a+b;

System.out.println(sum);

--loop for printing 1 to 10--
for(int i=1; i<10;i++){
System.out.println(i);
}
--pricision of variable --
int a=10,b=5,c=1,result;
result = a-++c-++b;
System.out.println(result);

--subtraction of two variable--
int a=10, b=5;
System.out.println("subtraction "+(a-b));



String gta[]={"tom","CJ", "gta3","gta4","Mical"};
//System.out.println(gtav[3]);
for(int i=0;i<4;i++)
{
System.out.print("\t"+(gta[i]));
}
*/
	
// int arr[] [] = new int[4] [5];
// int k=0;
// int i,j;
// for(i=0;i<4;i++)
// for(j=0;j<5;j++)
// {
// arr[i][j]=k;
// k++;

// }
// for(i=0;i<4;i++){
// for(j=0;j<5;j++)
// System.out.print(arr[i][j]+"  " );
// System.out.println();
// }
int i,j;

Scanner n = new Scanner(System.in);
System.out.println("enter the row count =>");
 int put = n.nextInt();
for(i=0;i< put;i++){
 char alpha= 'a';
    for(j=0;j<i;j++){
        System.out.print((alpha)+" ");
alpha++;
    }
    System.out.println("");
}
// alpha = 'a';
}
}

