package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Valider {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	@ManyToOne 
    private User user_spe;
	
	@ManyToOne 
    private User user_admin;
	
	@ManyToOne 
    private Publication publication;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser_spe() {
		return user_spe;
	}

	public void setUser_spe(User user_spe) {
		this.user_spe = user_spe;
	}

	public User getUser_admin() {
		return user_admin;
	}

	public void setUser_admin(User user_admin) {
		this.user_admin = user_admin;
	}

	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

}
