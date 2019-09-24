package com.inti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Employe;
import com.inti.services.interfaces.IEmployeService;

@RestController
@RequestMapping("/employe")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeController {
	
	@Autowired
	IEmployeService employeService;
	
	@GetMapping
	public List<Employe> findAll() {
		return employeService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Employe findById(@PathVariable("id") Long idEmploye) {
		return employeService.findById(idEmploye);
	}
	
	@PostMapping
	public void save(@RequestBody Employe employe) {
		employeService.save(employe);
	}
	
	@PutMapping(value = "/{id}")
	public void update(@PathVariable("id") Long idEmploye, @RequestBody Employe employe) {
		Employe e = employeService.findById(idEmploye);
		e.setNom(employe.getNom());
		e.setPrenom(employe.getPrenom());
		e.setDateNaissance(employe.getDateNaissance());
		e.setNumeroTelephone(employe.getNumeroTelephone());
		e.setAdresseMail(employe.getAdresseMail());
		e.setUsername(employe.getUsername());
		e.setPassword(employe.getPassword());
		employeService.save(e);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteById(@PathVariable("id") Long idEmploye) {
		employeService.deleteById(idEmploye);
	}

}
