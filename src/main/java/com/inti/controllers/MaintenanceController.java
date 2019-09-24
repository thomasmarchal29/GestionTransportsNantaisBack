package com.inti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Maintenance;
import com.inti.services.interfaces.IMaintenanceService;
import com.inti.services.interfaces.IMoyenTransportService;
import com.inti.services.interfaces.ITechnicienService;

@RestController
@RequestMapping("/maintenance")
@CrossOrigin(origins = "http://localhost:4200")
public class MaintenanceController {
	
	@Autowired
	IMaintenanceService maintenanceService;
	
	@Autowired
	IMoyenTransportService moyenTransportService;
	@Autowired
	ITechnicienService technicienService;
	
	@GetMapping
	public List<Maintenance> findAll() {
		return maintenanceService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Maintenance findById(@PathVariable("id") Long idMaintenance) {
		return maintenanceService.findById(idMaintenance);
	}
	
	@GetMapping(value = "ParAdmin/{id}")
	public List<Maintenance> findByAdmind(@PathVariable("id") Long idEmploye) {
		return maintenanceService.findByAdmin(idEmploye);
	}
	
	@PostMapping
	public void save(@RequestBody Maintenance maintenance) {
		maintenanceService.save(maintenance);
	}
	
	@PutMapping(value = "/{id}")
	public void update(@PathVariable("id") Long idMaintenance, @RequestBody Maintenance maintenance) {
		Maintenance m = maintenanceService.findById(idMaintenance);
		m.setDateMaintenance(maintenance.getDateMaintenance());
		m.setMoyenTransport(maintenance.getMoyenTransport());
		m.setListTechnicien(maintenance.getListTechnicien());
		maintenanceService.save(m);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteById(@PathVariable("id") Long idMaintenance) {
		maintenanceService.deleteById(idMaintenance);
	}
	
	@GetMapping(value = "/ParEmploye/{idEmploye}")
	public List<Maintenance> findByIdEmploye(@PathVariable("idEmploye") Long idEmploye) {
		return maintenanceService.findByIdEmploye(idEmploye);
	}

}
