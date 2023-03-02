package com.ventes.entities;

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
@Table(name = "ligneCommandeFournisseur")
public class LigneCommandeFournisseur extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;

	@ManyToOne
	@JoinColumn(name = "idCommandeFournisseur")
	private CommandeFournisseur commandeFournisseur;

}
