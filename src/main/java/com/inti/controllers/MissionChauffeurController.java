package com.inti.controllers;

import java.util.List;
import java.util.Optional;

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

import com.inti.entities.MissionChauffeur;
import com.inti.exceptions.MissionChauffeurIsNullException;
import com.inti.services.interfaces.IChauffeurService;
import com.inti.services.interfaces.IMissionChauffeurService;
import com.inti.services.interfaces.IMoyenTransportService;

@RestController
@RequestMapping("/missionChauffeur")
@CrossOrigin(origins = "http://localhost:4200")
public class MissionChauffeurController {

	@Autowired
	IMissionChauffeurService missionChauffeurService;

	@Autowired
	IMoyenTransportService moyenTransportService;
	@Autowired
	IChauffeurService chauffeurService;
	
	@GetMapping
	public List<MissionChauffeur> findAll() {
		return missionChauffeurService.findAll();
	}

	@GetMapping(value = "/{id}")
	public Optional<MissionChauffeur> findById(@PathVariable("id") Long idMissionChauffeur) {
		return missionChauffeurService.findById(idMissionChauffeur);
	}
	
	@GetMapping(value = "ParAdmin/{id}")
	public List<MissionChauffeur> findByAdmind(@PathVariable("id") Long idEmploye) {
		return missionChauffeurService.findByAdmin(idEmploye);
	}

	@PostMapping
	public void save(@RequestBody MissionChauffeur missionChauffeur) {
		missionChauffeurService.save(missionChauffeur);
	}

	@PutMapping(value = "/{id}")
	public void update(@PathVariable("id") Long idMissionChauffeur, @RequestBody MissionChauffeur missionChauffeur) {
		try {
			MissionChauffeur mc = missionChauffeurService.findById(idMissionChauffeur)
					.orElseThrow(() -> new MissionChauffeurIsNullException("Mission inexistante"));
			mc.setDateMission(missionChauffeur.getDateMission());
			mc.setHoraireMission(missionChauffeur.getHoraireMission());
			mc.setLigneNantes(missionChauffeur.getLigneNantes());
			mc.setMoyenTransport(missionChauffeur.getMoyenTransport());
			mc.setChauffeur(missionChauffeur.getChauffeur());
			missionChauffeurService.save(mc);
		} catch (MissionChauffeurIsNullException e) {
			e.printStackTrace();
		}
	}

	@DeleteMapping(value = "/{id}")
	public void deleteById(@PathVariable("id") Long idMissionChauffeur) {
		missionChauffeurService.deleteById(idMissionChauffeur);
	}

	@GetMapping(value = "/ParEmploye/{idEmploye}")
	public List<MissionChauffeur> findByIdEmploye(@PathVariable("idEmploye") Long idEmploye) {
		return missionChauffeurService.findByIdEmploye(idEmploye);
	}

}
