package com.ventes.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
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
@Table(name = "article")
public class Article extends AbstractEntity {

	@Column(name = "designation")
	private String designation;

	@Column(name = "prixUnitaireHt")
	private BigDecimal prixUnitaireHt;

	@Column(name = "tauxTva")
	private BigDecimal tauxTva;

	@Column(name = "prixUnitaireTtc")
	private BigDecimal prixUnitaireTtc;

	@Column(name = "photo")
	private String photo;
	
	@ManyToOne
	@JoinColumn(name = "idcategorie")
	private Category categorie;

}
