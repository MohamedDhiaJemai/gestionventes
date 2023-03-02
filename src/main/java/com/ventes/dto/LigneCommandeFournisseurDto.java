package com.ventes.dto;

import java.time.Instant;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LigneCommandeFournisseurDto {
	
	private Integer id;

	private String code;

	private Instant dateCommande;

	private FournisseurDto fournisseur;

	private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;
}
