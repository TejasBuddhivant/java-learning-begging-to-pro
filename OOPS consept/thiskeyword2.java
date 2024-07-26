class thiskeyword2{

void Get(thiskeyword2 a)
{
System.out.println("HELO WORLD "+a);
}

void Set()
{
Get(this);
System.out.println("TEJAAS");
}
public static void main(String... arr){
thiskeyword2 th=new thiskeyword2(34);

th.Set();
}
}