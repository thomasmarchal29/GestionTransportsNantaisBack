package com.inti.entities;

public enum HabilitationMoyenTransport {

	Bus,
	Tramway,
	Bus_et_tramway;

	public String enumeration = "";

	public String getEnumeration() {
		return enumeration;
	}

	public void setEnumeration(String enumeration) {
		this.enumeration = enumeration;
	}

}
