package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Commentaire {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id_Commentaire;
	
	String description;
	
	@ManyToOne 
    private Publication publication;
	
	@ManyToOne 
	private User user;

	public int getId_Commentaire() {
		return id_Commentaire;
	}

	public void setId(int id_Commentaire) {
		this.id_Commentaire = id_Commentaire;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}
