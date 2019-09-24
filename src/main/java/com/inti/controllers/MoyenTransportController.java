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

import com.inti.entities.MoyenTransport;
import com.inti.services.interfaces.IMoyenTransportService;

@RestController
@RequestMapping("/moyenTransport")
@CrossOrigin(origins = "http://localhost:4200")
public class MoyenTransportController {
	
	@Autowired
	IMoyenTransportService moyenTransportService;
	
	@GetMapping
	public List<MoyenTransport> findAll() {
		return moyenTransportService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public MoyenTransport findById(@PathVariable("id") Long idMoyenTransport) {
		return moyenTransportService.findById(idMoyenTransport);
	}
	
	@PostMapping
	public void save(@RequestBody MoyenTransport moyenTransport) {
		moyenTransportService.save(moyenTransport);
	}
	
	@PutMapping(value = "/{id}")
	public void update(@PathVariable("id") Long idMoyenTransport, @RequestBody MoyenTransport moyenTransport) {
		MoyenTransport mt = moyenTransportService.findById(idMoyenTransport);
		mt.setTypeMoyenTransport(moyenTransport.getTypeMoyenTransport());
		mt.setImmatriculation(moyenTransport.getImmatriculation());
		mt.setVetuste(moyenTransport.getVetuste());
		mt.setDateDerniereRevision(moyenTransport.getDateDerniereRevision());
		moyenTransportService.save(mt);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteById(@PathVariable("id") Long idMoyenTransport) {
		moyenTransportService.deleteById(idMoyenTransport);
	}

}
