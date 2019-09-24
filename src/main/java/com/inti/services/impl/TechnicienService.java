package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Technicien;
import com.inti.repositories.TechnicienRepository;
import com.inti.services.interfaces.ITechnicienService;

@Service
public class TechnicienService implements ITechnicienService {
	
	@Autowired
	TechnicienRepository technicienRepository;

	@Override
	public List<Technicien> findAll() {
		return technicienRepository.findAll();
	}

	@Override
	public Technicien findById(Long idTechnicien) {
		return technicienRepository.findById(idTechnicien).orElse(null);
	}
	
	@Override
	public void save(Technicien technicien) {
		technicienRepository.save(technicien);
	}

	@Override
	public void deleteById(Long idTechnicien) {
		technicienRepository.deleteById(idTechnicien);
	}

}
