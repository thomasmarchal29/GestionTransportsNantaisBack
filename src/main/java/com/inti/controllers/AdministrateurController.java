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

import com.inti.entities.Administrateur;
import com.inti.services.interfaces.IAdministrateurService;

@RestController
@RequestMapping("/administrateur")
@CrossOrigin(origins = "http://localhost:4200")
public class AdministrateurController {
	
	@Autowired
	IAdministrateurService administrateurService;
	
	@GetMapping
	public List<Administrateur> findAll() {
		return administrateurService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Administrateur findById(@PathVariable("id") Long idAdministrateur) {
		return administrateurService.findById(idAdministrateur);
	}
	
	@PostMapping
	public void save(@RequestBody Administrateur administrateur) {
		administrateurService.save(administrateur);
	}
	
	@PutMapping(value = "/{id}")
	public void update(@PathVariable("id") Long idAdministrateur, @RequestBody Administrateur administrateur) {
		Administrateur a = administrateurService.findById(idAdministrateur);
		a.setNom(administrateur.getNom());
		a.setPrenom(administrateur.getPrenom());
		a.setDateNaissance(administrateur.getDateNaissance());
		a.setNumeroTelephone(administrateur.getNumeroTelephone());
		a.setAdresseMail(administrateur.getAdresseMail());
		a.setUsername(administrateur.getUsername());
		a.setPassword(administrateur.getPassword());
		a.setGrade(administrateur.getGrade());
		administrateurService.save(a);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteById(@PathVariable("id") Long idAdministrateur) {
		administrateurService.deleteById(idAdministrateur);
	}

}
