package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Conges;

public interface ICongesService {
	
	public List<Conges> findAll();
	public Conges findById(Long idConges);
	public void save(Conges conges);
	public void deleteById(Long idConges);
	
	public List<Conges> findByIdEmploye(Long idEmploye);

}
