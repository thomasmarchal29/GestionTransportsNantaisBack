package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.MoyenTransport;

@Repository
public interface MoyenTransportRepository extends JpaRepository<MoyenTransport, Long> {

}
