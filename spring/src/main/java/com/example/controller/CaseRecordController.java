package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.LawServicee;
import com.example.demo.model.CaseRecordModel;


@RestController
public class CaseRecordController {
	
	@Autowired
	private LawServicee service;
	
	@GetMapping("/Lawyer/CaseRecord")
	public List<CaseRecordModel> getallcaserecord(){
		return service.getcaserocords();
	}
	@PostMapping("/Lawyer/CaseRecord")
	public CaseRecordModel addCaseRecord(@RequestBody CaseRecordModel data) {
		return service.addCaseRecord(data);
		
	}
	
	@PutMapping("/Lawyer/CaseRecord/{id}")
	public CaseRecordModel updateCaseRecord(CaseRecordModel data) {
		
		return service.updatecaserecord(data);
	}
	
	@DeleteMapping("/Lawyer/CaseRecord/{id}")
	public List<CaseRecordModel> deleteCaseRecord(@PathVariable int id){
		service.deletecaserecord(id);
		return service.getcaserocords();
	}
	
	@GetMapping("/Lawyer/CaseRecord/{id}")
	public CaseRecordModel viewCaseRecord(@PathVariable int id) {
		return service.viewCaseRecord(id);
	}
}
