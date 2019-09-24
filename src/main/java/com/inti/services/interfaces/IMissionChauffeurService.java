package com.inti.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.inti.entities.MissionChauffeur;

public interface IMissionChauffeurService {
	
	public List<MissionChauffeur> findAll();
	public Optional<MissionChauffeur> findById(Long idMissionChauffeur);
	public void save(MissionChauffeur missionChauffeur);
	public void deleteById(Long idMissionChauffeur);
	
	public List<MissionChauffeur> findByIdEmploye(Long idEmploye);
	public List<MissionChauffeur> findByAdmin(Long idEmploye);

}
