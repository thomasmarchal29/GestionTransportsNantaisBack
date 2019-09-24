package com.inti.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("chauffeur")
public class Chauffeur extends Employe {
	
	private HabilitationMoyenTransport habilitationMoyenTransport;
	private String permis;
	
	@OneToMany(mappedBy = "chauffeur", cascade = CascadeType.ALL)
	private List<MissionChauffeur> listMissionChauffeur = new ArrayList<MissionChauffeur>();
	
	public Chauffeur() {
		super();
	}

	public Chauffeur(HabilitationMoyenTransport habilitationMoyenTransport, String permis) {
		super();
		this.habilitationMoyenTransport = habilitationMoyenTransport;
		this.permis = permis;
	}

	public HabilitationMoyenTransport getHabilitationMoyenTransport() {
		return habilitationMoyenTransport;
	}

	public void setHabilitationMoyenTransport(HabilitationMoyenTransport habilitationMoyenTransport) {
		this.habilitationMoyenTransport = habilitationMoyenTransport;
	}

	public String getPermis() {
		return permis;
	}

	public void setPermis(String permis) {
		this.permis = permis;
	}
	
}
