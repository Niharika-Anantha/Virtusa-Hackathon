
package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lawyermodel")
public class LawyerModel {
	
	@Id
	@GeneratedValue
	private int lawyermodelid;
	private String lemail;
	private String lpassword;
	private String lusername;
	private String lmobileNumber;
	private boolean lactive;
	private String lrole;
	
	public LawyerModel() {}
	
	public LawyerModel(String lemail, String lpassword, String lusername, String lmobileNumber, boolean lactive,
			String lrole) {
		super();
		this.lemail = lemail;
		this.lpassword = lpassword;
		this.lusername = lusername;
		this.lmobileNumber = lmobileNumber;
		this.lactive = lactive;
		this.lrole = lrole;
	}



	@Override
	public String toString() {
		return "LawyerModel [lawyermodelid=" + lawyermodelid + ", lemail=" + lemail + ", lpassword=" + lpassword
				+ ", lusername=" + lusername + ", lmobileNumber=" + lmobileNumber + ", lactive=" + lactive + ", lrole="
				+ lrole + "]";
	}

	public int getLawyermodelid() {
		return lawyermodelid;
	}

	public void setLawyermodelid(int lawyermodelid) {
		this.lawyermodelid = lawyermodelid;
	}

	public String getLemail() {
		return lemail;
	}

	public void setLemail(String lemail) {
		this.lemail = lemail;
	}

	public String getLpassword() {
		return lpassword;
	}

	public void setLpassword(String lpassword) {
		this.lpassword = lpassword;
	}

	public String getLusername() {
		return lusername;
	}

	public void setLusername(String lusername) {
		this.lusername = lusername;
	}

	public String getLmobileNumber() {
		return lmobileNumber;
	}

	public void setLmobileNumber(String lmobileNumber) {
		this.lmobileNumber = lmobileNumber;
	}

	public boolean isLactive() {
		return lactive;
	}

	public void setLactive(boolean lactive) {
		this.lactive = lactive;
	}

	public String getLrole() {
		return lrole;
	}

	public void setLrole(String lrole) {
		this.lrole = lrole;
	}


	
}
