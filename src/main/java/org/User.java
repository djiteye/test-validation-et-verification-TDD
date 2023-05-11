package org;

public class User {
	
	 int id;
	 String nom;
	
	public User(int id, String nom) {
		this.id=id;
		this.nom=nom;
	}
	public User() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
