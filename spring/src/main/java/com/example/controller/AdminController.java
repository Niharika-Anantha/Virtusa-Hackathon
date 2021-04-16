package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.LawServicee;
import com.example.demo.model.LawyerModel;

@RestController

public class AdminController {

	
	@Autowired
	private LawServicee service;
	
	@GetMapping("/Admin/Lawyer1")
	public List<LawyerModel> getLawyer(){
		return service.getLawyer();
	}

	@GetMapping("/Admin/Lawyer/{id}")
	public Optional<LawyerModel> getLawyerById(int id){
		return service.getLawyerById(id);
	}
	
	
	@PostMapping("/Admin/Lawyer")
	public String addLawyer(LawyerModel data) {
		service.addLawyer(data);
		return "Lawyer Created";
	}
	
	@PutMapping("/Admin/Lawyer/{id}1")
	public String updateLawyer(LawyerModel data) {
		service.updatelawyer(data);
		return "Lawyer Updated";
	}
	
	@GetMapping("/Admin/Lawyer/{id}2")
	@Transactional
	public String removeLawyer(@PathVariable int id){
		service.removeLawyer(id);
		return "Lawyer Deleted";
	}
	
	
	

}
