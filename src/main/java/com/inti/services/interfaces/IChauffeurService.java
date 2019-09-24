package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Chauffeur;

public interface IChauffeurService {
	
	public List<Chauffeur> findAll();
	public Chauffeur findById(Long idChauffeur);
	public void save(Chauffeur chauffeur);
	public void deleteById(Long idChauffeur);

}
