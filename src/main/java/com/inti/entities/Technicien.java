package com.inti.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue("technicien")
public class Technicien extends Employe {
	
	private String diplome;
	@Column(name = "habilitationTechnique")
	private HabilitationMoyenTransport habilitationMoyenTransport;
	

	@ManyToMany(mappedBy = "listTechnicien", fetch = FetchType.LAZY)
	private List<Maintenance> listMaintenance = new ArrayList<Maintenance>();
	
	public Technicien() {
		super();
	}

	public Technicien(String diplome, HabilitationMoyenTransport habilitationMoyenTransport) {
		super();
		this.diplome = diplome;
		this.habilitationMoyenTransport = habilitationMoyenTransport;
	}
	
	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public HabilitationMoyenTransport getHabilitationMoyenTransport() {
		return habilitationMoyenTransport;
	}

	public void setHabilitationMoyenTransport(HabilitationMoyenTransport habilitationMoyenTransport) {
		this.habilitationMoyenTransport = habilitationMoyenTransport;
	}
	
}
