package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Employe;
import com.inti.repositories.EmployeRepository;
import com.inti.services.interfaces.IEmployeService;

@Service
public class EmployeService implements IEmployeService {
	
	@Autowired
	EmployeRepository employeRepository;

	@Override
	public List<Employe> findAll() {
		return employeRepository.findAll();
	}

	@Override
	public Employe findById(Long idEmploye) {
		return employeRepository.findById(idEmploye).orElse(null);
	}
	
	@Override
	public void save(Employe employe) {
		employeRepository.save(employe);
	}

	@Override
	public void deleteById(Long idEmploye) {
		employeRepository.deleteById(idEmploye);
	}

	@Override
	public Employe findOneByUsername(String username) {
		return employeRepository.findOneByUsername(username);
	}

	
}
