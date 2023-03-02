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
@Table(name = "commande_client")
public class CommandeClient extends AbstractEntity {

	@Column(name = "code")
	private String code;

	@CreatedDate
	@Column(name = "datecommande")
	private Instant dateCommande;

	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;

	@OneToMany(mappedBy = "commandeClient")
	private List<LigneCommandeClient> ligneCommandeClients;

}
