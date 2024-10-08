package Aggrigation;
//is a relationship in my word is noting but in the company many employee are there but they have differnt role 
//so that is a (is a) relation shipeg: employee is a software engineer


class parent{
String roles="Software Engineer";
void HiringSoftwareEng(String name,int age) {
	String ename= name;
	int eage= age;
	String erole=this.roles;
}
}
class child1{
	parent n;
	
	void display(parent n,int age) {
		System.out.println("Name of employee"+age);
		System.out.println("Name of age"+name);
		System.out.println("Name of role"+this.roles);
	}
}

public class IsArelationship {
	public static void main(String[] args) {
		parent o1= new parent();
		o1.HiringSoftwareEng("Tejas", 20);
		child1 o2= new child1();
		o2.display(o1);
	}
}



