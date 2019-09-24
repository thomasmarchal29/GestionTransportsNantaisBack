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

import com.inti.entities.Technicien;
import com.inti.services.interfaces.ITechnicienService;

@RestController
@RequestMapping("/technicien")
@CrossOrigin(origins = "http://localhost:4200")
public class TechnicienController {
	
	@Autowired
	ITechnicienService technicienService;
	
	@GetMapping
	public List<Technicien> findAll() {
		return technicienService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Technicien findById(@PathVariable("id") Long idTechnicien) {
		return technicienService.findById(idTechnicien);
	}
	
	@PostMapping
	public void save(@RequestBody Technicien technicien) {
		technicienService.save(technicien);
	}
	
	@PutMapping(value = "/{id}")
	public void update(@PathVariable("id") Long idTechnicien, @RequestBody Technicien technicien) {
		Technicien t = technicienService.findById(idTechnicien);
		t.setNom(technicien.getNom());
		t.setPrenom(technicien.getPrenom());
		t.setDateNaissance(technicien.getDateNaissance());
		t.setNumeroTelephone(technicien.getNumeroTelephone());
		t.setAdresseMail(technicien.getAdresseMail());
		t.setUsername(technicien.getUsername());
		t.setPassword(technicien.getPassword());
		t.setDiplome(technicien.getDiplome());
		t.setHabilitationMoyenTransport(technicien.getHabilitationMoyenTransport());
		technicienService.save(t);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteById(@PathVariable("id") Long idTechnicien) {
		technicienService.deleteById(idTechnicien);
	}

}
