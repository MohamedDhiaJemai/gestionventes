package com.ventes.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LigneCommandeClientDTO {
	
	private Integer id;
	
	private ArticleDto article;

	private CommandeClientDto commandeClient;
	
	private BigDecimal quantite;
	
	private BigDecimal prixUnitaire;

}
