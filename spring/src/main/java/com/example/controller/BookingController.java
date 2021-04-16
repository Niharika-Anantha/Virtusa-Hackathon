package com.example.demo.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.LawServicee;
import com.example.demo.model.BookingModel;

@RestController
public class BookingController {
	
	@Autowired
	private LawServicee service;
	
	@GetMapping("/Lawyer/booking1")
	public List<BookingModel> getBooking(){
		return service.getBooking();
	}

	@GetMapping("/Lawyer/booking")
	public List<BookingModel> getBookingByLawyer(){
		return service.getBooking();
	}
	
	@GetMapping("/Lawyer/{id}")
	public BookingModel bookingById(@PathVariable String id) {
		return service.bookingById(id);
	}
	
	@PostMapping("/Lawyer/booking2")
	public String statusModifier(BookingModel data) {
		data.bookingStatus=true;
		return "Booking Approved";
	}
	
	@PostMapping("/booking")
	public String addBooking(BookingModel data) {
		return "Booking Created";
	}
	
	@GetMapping("/Lawyer/booking/{id}")
	@Transactional
	public String removeBooking(@PathVariable String id){
		//bookingStatus=false;
		return "Booking Deleted";
	}
	
	
	

}
