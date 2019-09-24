package com.inti.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("administrateur")
public class Administrateur extends Employe {
	
	private String grade;
	
	@OneToMany(mappedBy = "administrateur", cascade = CascadeType.ALL)
	private List<MissionChauffeur> listMissionChauffeur = new ArrayList<MissionChauffeur>();
	
	@OneToMany(mappedBy = "administrateur", cascade = CascadeType.ALL)
	private List<Maintenance> listMaintenance = new ArrayList<Maintenance>();
	
	public Administrateur() {
		super();
	}

	public Administrateur(String grade) {
		super();
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
