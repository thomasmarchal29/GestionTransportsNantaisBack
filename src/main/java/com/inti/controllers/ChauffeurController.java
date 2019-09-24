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

import com.inti.entities.Chauffeur;
import com.inti.services.interfaces.IChauffeurService;

@RestController
@RequestMapping("/chauffeur")
@CrossOrigin(origins = "http://localhost:4200")
public class ChauffeurController {
	
	@Autowired
	IChauffeurService chauffeurService;
	
	@GetMapping
	public List<Chauffeur> findAll() {
		return chauffeurService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Chauffeur findById(@PathVariable("id") Long idChauffeur) {
		return chauffeurService.findById(idChauffeur);
	}
	
	@PostMapping
	public void save(@RequestBody Chauffeur chauffeur) {
		chauffeurService.save(chauffeur);
	}
	
	@PutMapping(value = "/{id}")
	public void update(@PathVariable("id") Long idChauffeur, @RequestBody Chauffeur chauffeur) {
		Chauffeur c = chauffeurService.findById(idChauffeur);
		c.setNom(chauffeur.getNom());
		c.setPrenom(chauffeur.getPrenom());
		c.setDateNaissance(chauffeur.getDateNaissance());
		c.setNumeroTelephone(chauffeur.getNumeroTelephone());
		c.setAdresseMail(chauffeur.getAdresseMail());
		c.setUsername(chauffeur.getUsername());
		c.setPassword(chauffeur.getPassword());
		c.setHabilitationMoyenTransport(chauffeur.getHabilitationMoyenTransport());
		chauffeurService.save(c);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteById(@PathVariable("id") Long idChauffeur) {
		chauffeurService.deleteById(idChauffeur);
	}

}
