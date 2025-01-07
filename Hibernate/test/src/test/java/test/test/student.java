package test.test;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollno;
    private String sname;
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

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	@Embedded
    private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", sname=" + sname + ", per=" + per + ", address=" + address + "]";
	}
    
    
}
