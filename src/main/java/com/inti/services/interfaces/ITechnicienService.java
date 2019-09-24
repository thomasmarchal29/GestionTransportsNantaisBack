package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Technicien;

public interface ITechnicienService {
	
	public List<Technicien> findAll();
	public Technicien findById(Long idTechnicien);
	public void save(Technicien technicien);
	public void deleteById(Long idTechnicien);

}
