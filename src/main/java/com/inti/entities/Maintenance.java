package com.inti.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Maintenance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMaintenance;
	@Temporal(TemporalType.DATE)
	private Date dateMaintenance;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "AdminResponsableAjout")
	private Administrateur administrateur;
	@ManyToOne
	@JoinColumn(name = "idMoyenTransport")
	private MoyenTransport moyenTransport;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "AffectationMaintenance", joinColumns = @JoinColumn(name = "idMaintenance"),
	inverseJoinColumns = @JoinColumn(name = "idEmploye"))
		private List<Technicien> listTechnicien = new ArrayList<Technicien>();

	public Maintenance() {
		super();
	}

	public Maintenance(Date dateMaintenance) {
		super();
		this.dateMaintenance = dateMaintenance;
	}
	
	public Long getIdMaintenance() {
		return idMaintenance;
	}

	public void setIdMaintenance(Long idMaintenance) {
		this.idMaintenance = idMaintenance;
	}

	public Date getDateMaintenance() {
		return dateMaintenance;
	}

	public void setDateMaintenance(Date dateMaintenance) {
		this.dateMaintenance = dateMaintenance;
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

	public List<Technicien> getListTechnicien() {
		return listTechnicien;
	}

	public void setListTechnicien(List<Technicien> listTechnicien) {
		this.listTechnicien = listTechnicien;
	}

}
