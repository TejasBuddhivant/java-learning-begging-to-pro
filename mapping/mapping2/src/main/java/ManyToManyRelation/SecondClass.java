package ManyToManyRelation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.dialect.identity.HANAIdentityColumnSupport;


@Table(name="SecondTable")
@Entity
public class SecondClass {

	@Id
	private int AnswerId;
	
	private String Answers;

	@Transient
	private JointTabels Aid = new JointTabels();
	Aid.set

	public int getAnswerId() {
		return AnswerId;
	}

	public void setAnswerId(int answerId) {
		AnswerId = answerId;
	}

	public String getAnswers() {
		return Answers;
	}

	public void setAnswers(String answers) {
		Answers = answers;
	}

	public SecondClass(int answerId, String answers) {
		super();
		AnswerId = answerId;
		Answers = answers;
	}

	public SecondClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
