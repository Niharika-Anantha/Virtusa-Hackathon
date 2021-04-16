package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.BookingModel;
import com.example.demo.model.CaseRecordModel;
import com.example.demo.model.LawyerModel;
import com.example.demo.model.LoginModel;
import com.example.demo.model.ReportModel;
import com.example.demo.model.UserModel;

public interface LawServicee {

	public List<BookingModel> getBooking();

	public List<BookingModel> getBookingByLawyer();

	public Optional<BookingModel> bookingById(int id);

	public void addCaseRecord(String id);

	public CaseRecordModel viewCaseRecord(int id);

	public CaseRecordModel addCaseRecord(CaseRecordModel data);

	public boolean checkMyUser(LoginModel data);

	public UserModel saveMyUser(UserModel user);

	public List<CaseRecordModel> getcaserocords();

	public ReportModel getreportbyId(String id);

	public BookingModel bookingById(String id);

	public List<ReportModel> gellallreports();

	public void deletecaserecord(int id);

	public CaseRecordModel updatecaserecord(CaseRecordModel data);

	public List<LawyerModel> getLawyer();

	public Optional<LawyerModel> getLawyerById(int id);

	public void addLawyer(LawyerModel data);

	public void removeLawyer(int id);

	public String updatelawyer(LawyerModel data);
	

}
