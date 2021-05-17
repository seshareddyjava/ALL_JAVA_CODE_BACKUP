import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity@Table
public class Mobile {
	
	private int mid;
	private String msim;
	private int mnumber;
	private Person per;
	@Id @GeneratedValue
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMsim() {
		return msim;
	}
	public void setMsim(String msim) {
		this.msim = msim;
	}
	public int getMnumber() {
		return mnumber;
	}
	
	public void setMnumber(int mnumber) {
		this.mnumber = mnumber;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkpid")
	public Person getPer() {
		return per;
	}
	public void setPer(Person per) {
		this.per = per;
	}
	
	

}
