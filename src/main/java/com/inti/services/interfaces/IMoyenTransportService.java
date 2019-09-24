package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.MoyenTransport;

public interface IMoyenTransportService {
	
	public List<MoyenTransport> findAll();
	public MoyenTransport findById(Long idMoyenTransport);
	public void save(MoyenTransport moyenTransport);
	public void deleteById(Long idMoyenTransport);

}
