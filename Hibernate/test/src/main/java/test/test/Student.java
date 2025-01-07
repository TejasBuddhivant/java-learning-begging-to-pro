package test.test;

import javax.persistence.*;

@Entity  //this will convert your properties/bin file to table
@Table(name = "new_students")
public class Student 

{
   @Id //for creating primary key
   @GeneratedValue(strategy = GenerationType.IDENTITY) //it is use for auto increment
   
   
	private int rollno;
   @Column(name = "s_name", unique = true)
	private String sname;
	@Column(nullable = false)
	@Embedded
	private address_embeddable Address;
	
	//@Transient //this key word is use for ignoring the column this will not create a coloum of age in this case 
	private int age;
	private double per;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

	public address_embeddable getAddress() {
		return Address;
	}
	public void setAddress(address_embeddable address) {
		Address = address;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", Address=" + Address + ", age=" + age + ", per="
				+ per + "]";
	}
}
