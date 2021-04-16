package com.example.demo.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.LawServicee;
import com.example.demo.model.LoginModel;

@RestController
public class LoginController {
	
	@Autowired
	private LawServicee service;
	
	@PostMapping("/login")
	@Transactional
	public boolean checkUser(@RequestBody LoginModel data) {
		if(service.checkMyUser(data))
		return true;
		return false;
	}

}
