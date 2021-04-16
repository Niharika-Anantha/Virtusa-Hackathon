package com.example.demo.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.LawServicee;
import com.example.demo.model.UserModel;


@RestController
public class SignUpController {
	
	@Autowired
	private LawServicee service;
	
	@PostMapping("/signup")
	public UserModel saveUser(@RequestBody UserModel user) {
		return service.saveMyUser(user);
	}

}
