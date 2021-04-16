package com.example.demo.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="caserecordmodel")
public class CaseRecordModel {
	
	@Id
	@GeneratedValue
	private int CaseRecordId;
	private Date date;
	private String eventDetail;
	private String actionTaken;
	@OneToOne(targetEntity = UserModel.class,cascade=CascadeType.ALL)
	@JoinColumn(name="bm_fk",referencedColumnName="usermodelid")
	private List<UserModel> issuedBy;
	
	public CaseRecordModel() {}

	public CaseRecordModel(int caseRecordId,  Date date, String eventDetail, String actionTaken,
			List<UserModel> issuedBy) {
		super();
		CaseRecordId = caseRecordId;
		
		this.date = date;
		this.eventDetail = eventDetail;
		this.actionTaken = actionTaken;
		this.issuedBy = issuedBy;
	}

	public int getCaseRecordId() {
		return CaseRecordId;
	}

	public void setCaseRecordId(int caseRecordId) {
		CaseRecordId = caseRecordId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEventDetail() {
		return eventDetail;
	}

	public void setEventDetail(String eventDetail) {
		this.eventDetail = eventDetail;
	}

	public String getActionTaken() {
		return actionTaken;
	}

	public void setActionTaken(String actionTaken) {
		this.actionTaken = actionTaken;
	}

	public List<UserModel> getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(List<UserModel> issuedBy) {
		this.issuedBy = issuedBy;
	}
	
}
