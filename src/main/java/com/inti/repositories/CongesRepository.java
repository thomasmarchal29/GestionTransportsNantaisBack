package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inti.entities.Conges;

@Repository
public interface CongesRepository extends JpaRepository<Conges, Long> {
	
	@Query(value = "from Conges c WHERE c.employe.idEmploye = :idEmploye")
	public List<Conges> findByIdEmploye(@Param("idEmploye") Long idEmploye);

}
