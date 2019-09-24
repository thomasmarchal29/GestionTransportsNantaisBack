package com.inti.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.MissionChauffeur;
import com.inti.repositories.MissionChauffeurRepository;
import com.inti.services.interfaces.IMissionChauffeurService;

@Service
public class MissionChauffeurService implements IMissionChauffeurService {
	
	@Autowired
	MissionChauffeurRepository missionChauffeurRepository;

	@Override
	public List<MissionChauffeur> findAll() {
		return missionChauffeurRepository.findAll();
	}

	@Override
	public Optional<MissionChauffeur> findById(Long idMissionChauffeur) {
		return missionChauffeurRepository.findById(idMissionChauffeur);
	}
	
	@Override
	public void save(MissionChauffeur missionChauffeur) {
		missionChauffeurRepository.save(missionChauffeur);
	}

	@Override
	public void deleteById(Long idMissionChauffeur) {
		missionChauffeurRepository.deleteById(idMissionChauffeur);
	}

	@Override
	public List<MissionChauffeur> findByIdEmploye(Long idEmploye) {
		return missionChauffeurRepository.findByIdEmploye(idEmploye);
	}

	@Override
	public List<MissionChauffeur> findByAdmin(Long idEmploye) {
		return missionChauffeurRepository.findByAdmin(idEmploye);
	}

}
