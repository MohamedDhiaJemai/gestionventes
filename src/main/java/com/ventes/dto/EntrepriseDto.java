package com.ventes.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EntrepriseDto {
	
	private Integer id;
	
	private String nom;

	private String designation;

	private AdresseDto adresse;
	
	private String codeFiscal;
	
	private String photo;
	
	private String email;
	
	private String numTel;
	
	private String siteWeb;
	
	List<UtilisateurDto> utilisateurs;

}
