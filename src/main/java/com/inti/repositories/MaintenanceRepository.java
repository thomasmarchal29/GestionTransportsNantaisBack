package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inti.entities.Maintenance;

@Repository
public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {
	
	@Query(value = "select * from affectation_maintenance am, maintenance m "
			+ "WHERE am.id_maintenance = m.id_maintenance AND am.id_employe = :idEmploye", nativeQuery = true)
	public List<Maintenance> findByIdEmploye(@Param("idEmploye") Long idEmploye);
	
	@Query(value = "from Maintenance m WHERE m.administrateur.idEmploye = :idEmploye")
	public List<Maintenance> findByAdmin(@Param("idEmploye") Long idEmploye);

}
