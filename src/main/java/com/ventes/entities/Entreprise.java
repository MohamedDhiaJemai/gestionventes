package com.ventes.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Builder
@Table(name = "entreprise")
@Data
@EqualsAndHashCode(callSuper = true)
public class Entreprise extends AbstractEntity {
	
	private String nom;

	private String designation;

	private Adresse adresse;
	
	private String codeFiscal;
	
	private String photo;
	
	private String email;
	
	private String numTel;
	
	private String siteWeb;
	
	@OneToMany(mappedBy = "entreprise")
	List<Utilisateur> utilisateurs;
	
}
