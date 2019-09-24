package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Maintenance;

public interface IMaintenanceService {
	
	public List<Maintenance> findAll();
	public Maintenance findById(Long idMaintenance);
	public void save(Maintenance maintenance);
	public void deleteById(Long idMaintenance);
	
	public List<Maintenance> findByIdEmploye(Long idEmploye);
	public List<Maintenance> findByAdmin(Long idEmploye);

}
