package com.inti.entities;

public enum EtatConges {
	
	En_attente_de_validation,
	Acceptés,
	Refusés;

	public String enumeration = "";

	public String getEnumeration() {
		return enumeration;
	}

	public void setEnumeration(String enumeration) {
		this.enumeration = enumeration;
	}
	
}
