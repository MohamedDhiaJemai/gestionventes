package com.ventes.entities;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "commandefournisseur")
public class CommandeFournisseur extends AbstractEntity {

	@Column(name = "code")
	private String code;

	@CreatedDate
	private Instant dateCommande;

	@ManyToOne
	@JoinColumn(name = "idfournisseur")
	private Fournisseur fournisseur;

	@OneToMany(mappedBy = "commandeFournisseur")
	private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;

}
