package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Maintenance;
import com.inti.repositories.MaintenanceRepository;
import com.inti.services.interfaces.IMaintenanceService;

@Service
public class MaintenanceService implements IMaintenanceService {
	
	@Autowired
	MaintenanceRepository maintenanceRepository;

	@Override
	public List<Maintenance> findAll() {
		return maintenanceRepository.findAll();
	}

	@Override
	public Maintenance findById(Long idMaintenance) {
		return maintenanceRepository.findById(idMaintenance).orElse(null);
	}
	
	@Override
	public void save(Maintenance maintenance) {
		maintenanceRepository.save(maintenance);
	}

	@Override
	public void deleteById(Long idMaintenance) {
		maintenanceRepository.deleteById(idMaintenance);
	}

	@Override
	public List<Maintenance> findByIdEmploye(Long idEmploye) {
		return maintenanceRepository.findByIdEmploye(idEmploye);
	}

	@Override
	public List<Maintenance> findByAdmin(Long idEmploye) {
		return maintenanceRepository.findByAdmin(idEmploye);
	}

}
