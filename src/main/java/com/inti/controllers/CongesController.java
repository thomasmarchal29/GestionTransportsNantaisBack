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

import com.inti.entities.Conges;
import com.inti.services.interfaces.ICongesService;

@RestController
@RequestMapping("/conges")
@CrossOrigin(origins = "http://localhost:4200")
public class CongesController {
	
	@Autowired
	ICongesService congesService;
	
	@GetMapping
	public List<Conges> findAll() {
		return congesService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Conges findById(@PathVariable("id") Long idConges) {
		return congesService.findById(idConges);
	}
	
	@GetMapping(value = "/ParEmploye/{id}")
	public List<Conges> findByIdEmploye(@PathVariable("id") Long idEmploye) {
		return congesService.findByIdEmploye(idEmploye);
	}
	
	@PostMapping
	public void save(@RequestBody Conges conges) {
		congesService.save(conges);
	}
	
	@PutMapping(value = "/{id}")
	public void update(@PathVariable("id") Long idConges, @RequestBody Conges conges) {
		Conges c = congesService.findById(idConges);
		c.setDateDebut(conges.getDateDebut());
		c.setDateFin(conges.getDateFin());
		c.setCommentaire(conges.getCommentaire());
		c.setEtatConges(conges.getEtatConges());
		congesService.save(c);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteById(@PathVariable("id") Long idConges) {
		congesService.deleteById(idConges);
	}

}
