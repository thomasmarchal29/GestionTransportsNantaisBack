package com.inti.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MoyenTransport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMoyenTransport;
	private TypeMoyenTransport typeMoyenTransport;
	private String immatriculation;
	private String vetuste;
	@Temporal(TemporalType.DATE)
	private Date dateDerniereRevision;
	
	@OneToMany(mappedBy = "moyenTransport", cascade = CascadeType.ALL)
	private List<MissionChauffeur> listMissionChauffeur = new ArrayList<MissionChauffeur>();
	
	@OneToMany(mappedBy = "moyenTransport", cascade = CascadeType.ALL)
	private List<Maintenance> listMaintenance = new ArrayList<Maintenance>();
	
	public MoyenTransport() {
		super();
	}

	public MoyenTransport(TypeMoyenTransport typeMoyenTransport, String immatriculation, String vetuste,
			Date dateDerniereRevision) {
		super();
		this.typeMoyenTransport = typeMoyenTransport;
		this.immatriculation = immatriculation;
		this.vetuste = vetuste;
		this.dateDerniereRevision = dateDerniereRevision;
	}

	public Long getIdMoyenTransport() {
		return idMoyenTransport;
	}

	public void setIdMoyenTransport(Long idMoyenTransport) {
		this.idMoyenTransport = idMoyenTransport;
	}

	public TypeMoyenTransport getTypeMoyenTransport() {
		return typeMoyenTransport;
	}

	public void setTypeMoyenTransport(TypeMoyenTransport typeMoyenTransport) {
		this.typeMoyenTransport = typeMoyenTransport;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getVetuste() {
		return vetuste;
	}

	public void setVetuste(String vetuste) {
		this.vetuste = vetuste;
	}

	public Date getDateDerniereRevision() {
		return dateDerniereRevision;
	}

	public void setDateDerniereRevision(Date dateDerniereRevision) {
		this.dateDerniereRevision = dateDerniereRevision;
	}

}
