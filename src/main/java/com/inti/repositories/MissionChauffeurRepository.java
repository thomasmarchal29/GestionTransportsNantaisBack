package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inti.entities.MissionChauffeur;

@Repository
public interface MissionChauffeurRepository extends JpaRepository<MissionChauffeur, Long> {
	
	@Query(value = "from MissionChauffeur mc WHERE mc.chauffeur.idEmploye = :idEmploye")
	public List<MissionChauffeur> findByIdEmploye(@Param("idEmploye") Long idEmploye);
	
	@Query(value = "from MissionChauffeur mc WHERE mc.administrateur.idEmploye = :idEmploye")
	public List<MissionChauffeur> findByAdmin(@Param("idEmploye") Long idEmploye);
	
}
