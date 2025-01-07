package OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Table(name = "table_no2")
@Entity
public class TableNo2 {

   @Id
   
	private int AnswerId2;
	
	private String Answers;
	
	@OneToOne
	private TableNo1 questionNo;
	
	public TableNo2(int answerId, String answers) {
		super();
		AnswerId2 = answerId;
		Answers = answers;
        questionNo = questionNo;
	}
	
	
	public TableNo2() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getAnswerId() {
		return AnswerId2;
	}
	public void setAnswerId(int answerId) {
		AnswerId2 = answerId;
	}
	public String getAnswers() {
		return Answers;
	}
	public void setAnswers(String answers) {
		Answers = answers;
	}


	public TableNo1 getQuestionNo() {
		return questionNo;
	}


	public void setQuestionNo(TableNo1 questionNo) {
		this.questionNo = questionNo;
	}

	
	

	
	

	
	
}
