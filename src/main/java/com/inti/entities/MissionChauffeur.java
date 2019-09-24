package com.inti.entities;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MissionChauffeur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMissionChauffeur;
	@Temporal(TemporalType.DATE)
	private Date dateMission;
	private Time horaireMission;
	private LigneNantes ligneNantes;
	
	@ManyToOne
	@JoinColumn(name = "AdminResponsableAjout")
	private Administrateur administrateur;
	@ManyToOne
	@JoinColumn(name = "idMoyenTransport")
	private MoyenTransport moyenTransport;
	@ManyToOne
	@JoinColumn(name = "idChauffeur")
	private Chauffeur chauffeur;
	
	public MissionChauffeur() {
		super();
	}
	
	public MissionChauffeur(Date dateMission, Time horaireMission, LigneNantes ligneNantes) {
		super();
		this.dateMission = dateMission;
		this.horaireMission = horaireMission;
		this.ligneNantes = ligneNantes;
	}

	public Long getIdMissionChauffeur() {
		return idMissionChauffeur;
	}

	public void setIdMissionChauffeur(Long idMissionChauffeur) {
		this.idMissionChauffeur = idMissionChauffeur;
	}

	public Date getDateMission() {
		return dateMission;
	}

	public void setDateMission(Date dateMission) {
		this.dateMission = dateMission;
	}

	public Time getHoraireMission() {
		return horaireMission;
	}

	public void setHoraireMission(Time horaireMission) {
		this.horaireMission = horaireMission;
	}

	public LigneNantes getLigneNantes() {
		return ligneNantes;
	}

	public void setLigneNantes(LigneNantes ligneNantes) {
		this.ligneNantes = ligneNantes;
	}

	public Administrateur getAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(Administrateur administrateur) {
		this.administrateur = administrateur;
	}
	
	public MoyenTransport getMoyenTransport() {
		return moyenTransport;
	}

	public void setMoyenTransport(MoyenTransport moyenTransport) {
		this.moyenTransport = moyenTransport;
	}

	public Chauffeur getChauffeur() {
		return chauffeur;
	}

	public void setChauffeur(Chauffeur chauffeur) {
		this.chauffeur = chauffeur;
	}

}
