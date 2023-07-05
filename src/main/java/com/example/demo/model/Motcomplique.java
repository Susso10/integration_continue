package com.example.demo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Motcomplique {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	String mot;
	
	@ManyToOne 
    private Langue langue_origine;
	
	String traduction;
	
	@ManyToOne 
    private Langue langue_traduction;
	
	@ManyToOne 
    private Publication publication;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMot() {
		return mot;
	}

	public void setMot(String mot) {
		this.mot = mot;
	}

	public Langue getLangue_origine() {
		return langue_origine;
	}

	public void setLangue_origine(Langue langue_origine) {
		this.langue_origine = langue_origine;
	}

	public String getTraduction() {
		return traduction;
	}

	public void setTraduction(String traduction) {
		this.traduction = traduction;
	}

	public Langue getLangue_traduction() {
		return langue_traduction;
	}

	public void setLangue_traduction(Langue langue_traduction) {
		this.langue_traduction = langue_traduction;
	}

	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

}
