package com.ventes.entities;

import java.time.Instant;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "utilisateur")
@Builder
public class Utilisateur extends AbstractEntity {

	private String nom;

	private String prenom;

	private String email;
	
	private Instant dateDeNaissance;

	private String motDePasse;
	
	@Embedded
	private Adresse Adresse;
	
	private String photo;
	
	@ManyToOne
	@JoinColumn(name = "idEntreprise")
	private Entreprise entreprise;
	
	@OneToMany(mappedBy = "utilisateur")
	private List<Roles> roles;

}
