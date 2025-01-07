package OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "table_no1")
@Entity
public class TableNo1 {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;

	private String name;
	
	@OneToOne
	private TableNo2 AnswerId;
	
	
	

	public TableNo1(int rollno, String name, TableNo2 answerId) {
		super();
		this.rollno = rollno;
		this.name = name;
		AnswerId = answerId;
	}

	
	
	public TableNo1() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TableNo2 getAnswerId() {
		return AnswerId;
	}

	public void setAnswerId(TableNo2 answerId) {
		AnswerId = answerId;
	}

	
}
