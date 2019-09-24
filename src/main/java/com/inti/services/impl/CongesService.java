package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Conges;
import com.inti.repositories.CongesRepository;
import com.inti.services.interfaces.ICongesService;

@Service
public class CongesService implements ICongesService {
	
	@Autowired
	CongesRepository congesRepository;

	@Override
	public List<Conges> findAll() {
		return congesRepository.findAll();
	}

	@Override
	public Conges findById(Long idConges) {
		return congesRepository.findById(idConges).orElse(null);
	}
	
	@Override
	public void save(Conges conges) {
		congesRepository.save(conges);
	}

	@Override
	public void deleteById(Long idConges) {
		congesRepository.deleteById(idConges);
	}

	@Override
	public List<Conges> findByIdEmploye(Long idEmploye) {
		return congesRepository.findByIdEmploye(idEmploye);
	}

}
