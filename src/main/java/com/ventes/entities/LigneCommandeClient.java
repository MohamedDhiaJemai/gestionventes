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
@Table(name = "ligne_commande_client")
public class LigneCommandeClient extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name = "id_article")
	private Article article;

	@ManyToOne
	@JoinColumn(name = "id_commande_client")
	private CommandeClient commandeClient;
	
	private BigDecimal quantite;
	
	private BigDecimal prixUnitaire;

}
