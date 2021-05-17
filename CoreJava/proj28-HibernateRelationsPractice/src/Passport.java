import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Passport {
	
	private int ppid;
	private String ppnum;
	private int pped;
	
	private Person person;
	@Id
	@GeneratedValue
	public int getPpid() {
		return ppid;
	}

	public void setPpid(int ppid) {
		this.ppid = ppid;
	}

	public String getPpnum() {
		return ppnum;
	}

	public void setPpnum(String ppnum) {
		this.ppnum = ppnum;
	}

	public int getPped() {
		return pped;
	}

	public void setPped(int pped) {
		this.pped = pped;
	}
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkid")
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	

}
