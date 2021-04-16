package com.example.demo.model;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="bookingmodel")
public class BookingModel {
	
	@Id
	private String bookingId;
	private int clientDetail;
	//private LawyerModel LawyerDetail;
	private String lawfirmName;
	private Date date;
	private String time;
	public boolean bookingStatus;
	
	@OneToOne(targetEntity = UserModel.class,cascade=CascadeType.ALL)
	@JoinColumn(name="bm_fk",referencedColumnName="usermodelid")
	private List<UserModel> usermodel ;
	public BookingModel() {}
	
	public BookingModel(String bookingId, int clientDetail, String lawfirmName,
			Date date, String time, boolean bookingStatus) {
		super();
		this.bookingId = bookingId;
		this.clientDetail = clientDetail;
		//LawyerDetail = lawyerDetail;
		this.lawfirmName = lawfirmName;
		this.date = date;
		this.time = time;
		this.bookingStatus = bookingStatus;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public int getClientDetail() {
		return clientDetail;
	}
	public void setClientDetail(int clientDetail) {
		this.clientDetail = clientDetail;
	}
	
	public String getLawfirmName() {
		return lawfirmName;
	}
	public void setLawfirmName(String lawfirmName) {
		this.lawfirmName = lawfirmName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public boolean isBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(boolean bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

}
