package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Employe;

public interface IEmployeService {
	
	public List<Employe> findAll();
	public Employe findById(Long idEmploye);
	public void save(Employe employe);
	public void deleteById(Long idEmploye);
	
	public Employe findOneByUsername(String username);

}
