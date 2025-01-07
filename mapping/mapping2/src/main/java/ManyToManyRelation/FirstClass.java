package ManyToManyRelation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="FirstTable")
@Entity
public class FirstClass {

	
    @Id
    private int QuestionId;
    
    private String Questions;

	public int getQuestionId() {
		return QuestionId;
	}

	public void setQuestionId(int questionId) {
		QuestionId = questionId;
	}

	public String getQuestions() {
		return Questions;
	}

	public void setQuestions(String questions) {
		Questions = questions;
	}

	public FirstClass(int questionId, String questions) {
		super();
		QuestionId = questionId;
		Questions = questions;
	}

	public FirstClass() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
