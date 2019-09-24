package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Chauffeur;
import com.inti.repositories.ChauffeurRepository;
import com.inti.services.interfaces.IChauffeurService;

@Service
public class ChauffeurService implements IChauffeurService {
	
	@Autowired
	ChauffeurRepository chauffeurRepository;

	@Override
	public List<Chauffeur> findAll() {
		return chauffeurRepository.findAll();
	}

	@Override
	public Chauffeur findById(Long idChauffeur) {
		return chauffeurRepository.findById(idChauffeur).orElse(null);
	}
	
	@Override
	public void save(Chauffeur chauffeur) {
		chauffeurRepository.save(chauffeur);
	}

	@Override
	public void deleteById(Long idChauffeur) {
		chauffeurRepository.deleteById(idChauffeur);
	}

}
