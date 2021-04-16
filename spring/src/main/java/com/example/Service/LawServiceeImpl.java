package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BookingModel;
import com.example.demo.model.CaseRecordModel;
import com.example.demo.model.LawyerModel;
import com.example.demo.model.LoginModel;
import com.example.demo.model.ReportModel;
import com.example.demo.model.UserModel;
import com.example.demo.repository.BookingRepository;
import com.example.demo.repository.CaseRecordRepository;
import com.example.demo.repository.LawyerRepository;
import com.example.demo.repository.ReportRepository;
import com.example.demo.repository.UserRepository;

@Service
public class LawServiceeImpl implements LawServicee {

	@Autowired
	private BookingRepository bookingrepository;
	
	@Autowired
	private CaseRecordRepository caserecordrepository;
	
	@Autowired
	private ReportRepository reportrepository;
	
	@Autowired
	private UserRepository userrepository;
	
	@Autowired
	private LawyerRepository lawyerrepository;
	
	@Override
	@Transactional
	public List<BookingModel> getBooking() {
		
		return bookingrepository.findAll();
	}

	@Override
	public List<BookingModel> getBookingByLawyer() {
		
		//return bookingrepository.findAllById(id);
		return null;
	}

	public Optional<BookingModel> bookingById(int id) {
		
		return bookingrepository.findById(id);
	}

	@Override
	public void addCaseRecord(String id) {
		
	}

	@Override
	public CaseRecordModel addCaseRecord(CaseRecordModel data) {
		return caserecordrepository.save(data);
		
	}

	@Override
	public boolean checkMyUser(LoginModel data) {
		// TODO Auto-generated method stub
		return userrepository.findByUsername(data);
	}

	public UserModel saveMyUser(UserModel user) {
		return userrepository.save(user);
	}

	@Override
	@Transactional
	public List<CaseRecordModel> getcaserocords() {
		// TODO Auto-generated method stub
		return caserecordrepository.findAll();
	}

	@Override
	@Transactional
	public ReportModel getreportbyId(String id) {
		Optional<ReportModel> Response =  reportrepository.findById(id);
		ReportModel report = null;
		if(Response.isPresent()) {
			report = Response.get();
		}else {
			throw new RuntimeException("No record found for given id: "+id);
		}
		return  report;// reportrepository.findById(id);
	}

	@Override
	@Transactional
	public BookingModel bookingById(String id) {
		return null;// bookingrepository.findById(id);
	}
	//incomplete
	@Override
	public void deletecaserecord(int id) {
		caserecordrepository.deleteById(id);;;
		
	}

	@Override
	@Transactional
	public List<ReportModel> gellallreports() {
		return reportrepository.findAll();
	}

	@Override
	@Transactional
	public CaseRecordModel viewCaseRecord(int id) {
		Optional<CaseRecordModel> model =  caserecordrepository.findById(id);
		CaseRecordModel record = null;
		if(model.isPresent()) {
			record = model.get();
		}else {
			throw new RuntimeException("No record found for given id: "+id);
		}
		return record;
	}
	//yet to be done
	@Override
	@Transactional
	public CaseRecordModel updatecaserecord(CaseRecordModel data) {
		return caserecordrepository.save(data);
		
	}

	@Override
	public List<LawyerModel> getLawyer() {
		return (List<LawyerModel>) lawyerrepository.findAll();
	}

	@Override
	public Optional<LawyerModel> getLawyerById(int id) {
		
		return  (Optional<LawyerModel>)lawyerrepository.findById(id);
	}

	@Override
	public void addLawyer(LawyerModel data) {
		
		lawyerrepository.save(data);
		
	}

	@Override
	public void removeLawyer(int id) {
		
		lawyerrepository.deleteById(id);
		
	}

	@Override
	public String updatelawyer(LawyerModel data) {
		
		return null;
	}



	

}
