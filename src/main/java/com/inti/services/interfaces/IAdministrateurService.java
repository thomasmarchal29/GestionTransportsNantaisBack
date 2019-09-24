package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Administrateur;

public interface IAdministrateurService {
	
	public List<Administrateur> findAll();
	public Administrateur findById(Long idAdministrateur);
	public void save(Administrateur administrateur);
	public void deleteById(Long idAdministrateur);

}
