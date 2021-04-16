package com.example.demo.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="reportmodel")
public class ReportModel {
	
	@Id
	private String reportId;
	private Date date;
	private String report;
	@ManyToOne(targetEntity = BookingModel.class,cascade=CascadeType.ALL)
	@JoinColumn(name="rm_fk",referencedColumnName="bookingId")
	private List<BookingModel> appointmentDetail;
	
	@ManyToOne(targetEntity=CaseRecordModel.class,cascade = CascadeType.ALL)
	@JoinColumn(name="cs_fk",referencedColumnName="CaseRecordId")
	private List<CaseRecordModel> caseRecordDetail;
	public ReportModel() {}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	
	public List<BookingModel> getAppointmentDetail() {
		return appointmentDetail;
	}
	public void setAppointmentDetail(List<BookingModel> appointmentDetail) {
		this.appointmentDetail = appointmentDetail;
	}
	public List<CaseRecordModel> getCaseRecordDetail() {
		return caseRecordDetail;
	}
	public void setCaseRecordDetail(List<CaseRecordModel> caseRecordDetail) {
		this.caseRecordDetail = caseRecordDetail;
	}
	public ReportModel(Date date, String report, List<BookingModel> appointmentDetail,
			List<CaseRecordModel> caseRecordDetail) {
		super();
		this.date = date;
		this.report = report;
		this.appointmentDetail = appointmentDetail;
		this.caseRecordDetail = caseRecordDetail;
	}
	

	
	
}
