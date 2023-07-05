package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Mot_publication {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id_MotPublication;
	
	@ManyToOne 
    private Publication publication;
	
	@ManyToOne 
    private Mot_cle mot_cle;

	public int getId_MotPublication() {
		return id_MotPublication;
	}

	public void setId_MotPublication(int id_MotPublication) {
		this.id_MotPublication = id_MotPublication;
	}

	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

	public Mot_cle getMot_cle() {
		return mot_cle;
	}

	public void setMot_cle(Mot_cle mot_cle) {
		this.mot_cle = mot_cle;
	}
	
	

}
