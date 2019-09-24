package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.MoyenTransport;
import com.inti.repositories.MoyenTransportRepository;
import com.inti.services.interfaces.IMoyenTransportService;

@Service
public class MoyenTransportService implements IMoyenTransportService {
	
	@Autowired
	MoyenTransportRepository moyenTransportRepository;

	@Override
	public List<MoyenTransport> findAll() {
		return moyenTransportRepository.findAll();
	}

	@Override
	public MoyenTransport findById(Long idMoyenTransport) {
		return moyenTransportRepository.findById(idMoyenTransport).orElse(null);
	}
	
	@Override
	public void save(MoyenTransport moyenTransport) {
		moyenTransportRepository.save(moyenTransport);
	}

	@Override
	public void deleteById(Long idMoyenTransport) {
		moyenTransportRepository.deleteById(idMoyenTransport);
	}

}
