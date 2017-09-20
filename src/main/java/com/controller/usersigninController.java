package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.DAO.PatientDAO;
import com.IDAO.IPatientDAO;
import com.domain.UserSignup;

import com.repo.usersigninRepository;

@RestController
@RequestMapping("/user")
public class usersigninController {
	
	@Autowired
	private usersigninRepository patientDAO;
	@RequestMapping("/login")
	 @ResponseBody
	 public UserSignup findByName(@RequestParam("username") String username,@RequestParam("password") String password){
		 	return patientDAO.find(username,password); 
	 }

}
