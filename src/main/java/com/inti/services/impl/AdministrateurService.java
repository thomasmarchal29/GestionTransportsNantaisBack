package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Administrateur;
import com.inti.repositories.AdministrateurRepository;
import com.inti.services.interfaces.IAdministrateurService;

@Service
public class AdministrateurService implements IAdministrateurService {
	
	@Autowired
	AdministrateurRepository administrateurRepository;

	@Override
	public List<Administrateur> findAll() {
		return administrateurRepository.findAll();
	}

	@Override
	public Administrateur findById(Long idAdministrateur) {
		return administrateurRepository.findById(idAdministrateur).orElse(null);
	}
	
	@Override
	public void save(Administrateur administrateur) {
		administrateurRepository.save(administrateur);
	}

	@Override
	public void deleteById(Long idAdministrateur) {
		administrateurRepository.deleteById(idAdministrateur);
	}

}
