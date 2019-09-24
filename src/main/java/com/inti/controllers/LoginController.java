package com.inti.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Employe;
import com.inti.services.interfaces.IEmployeService;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

	@Autowired
	IEmployeService employeService;
	
	public Employe login(Principal principal) {
		return employeService.findOneByUsername(principal.getName());
	}
}
