package com.ventes.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "lignevente")
public class LigneVente extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name = "idvente")
	private Ventes vente;

	private BigDecimal quantite;
	
	private BigDecimal prixUnitaire;

}
