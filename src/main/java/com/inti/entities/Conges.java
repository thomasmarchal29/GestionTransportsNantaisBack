package com.inti.entities;

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
public class Conges {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idConges;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	private String commentaire;
	private EtatConges etatConges;
	
	@ManyToOne
	@JoinColumn(name = "idEmploye")
	private Employe employe;
	
	public Conges() {
		super();
	}

	public Conges(Date dateDebut, Date dateFin, String commentaire, EtatConges etatConges) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.commentaire = commentaire;
		this.etatConges = etatConges;
	}

	public Long getIdConges() {
		return idConges;
	}

	public void setIdConges(Long idConges) {
		this.idConges = idConges;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public EtatConges getEtatConges() {
		return etatConges;
	}

	public void setEtatConges(EtatConges etatConges) {
		this.etatConges = etatConges;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

}
