package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.LawServicee;
import com.example.demo.model.ReportModel;

@RestController
public class ReportController {
	@Autowired
	private LawServicee service;
	
	@GetMapping("/Reports")
	public List<ReportModel> getall(){
		return service.gellallreports();
	}
	
	@GetMapping("/Reports/{id}")
	public ReportModel getReportDetails(@PathVariable String id){
		return service.getreportbyId(id);
	}

}
