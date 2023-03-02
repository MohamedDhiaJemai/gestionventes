package com.ventes.dto;

import java.math.BigDecimal;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ventes.entities.Ventes;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LigneVenteDto {
	
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "idvente")
	private Ventes vente;

	private BigDecimal quantite;
	
	private BigDecimal prixUnitaire;
}
