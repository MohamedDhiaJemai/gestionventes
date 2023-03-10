package com.ventes.dto;

import java.time.Instant;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UtilisateurDto {
	
	private Integer id;
	
	private String nom;

	private String prenom;

	private String email;
	
	private Instant dateDeNaissance;

	private String motDePasse;
	
	private AdresseDto Adresse;
	
	private String photo;
	
	private EntrepriseDto entreprise;
	
	private List<RolesDto> roles;

}
