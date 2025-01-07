package ManyToManyRelation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Table(name="JoindTable")
@Entity
public class JointTabels {

	@Id
	private int srNo;
	
	@ManyToMany
     private int Qid;
	
	@ManyToMany
	private int Aid;

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public int getQid() {
		return Qid;
	}

	public void setQid(int qid) {
		Qid = qid;
	}

	public int getAid() {
		return Aid;
	}

	public void setAid(int aid) {
		Aid = aid;
	}
	
	
	
	
	
}
