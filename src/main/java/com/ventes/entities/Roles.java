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
@Table(name = "roles")
public class Roles extends AbstractEntity {

	private String roleName;
	
	@ManyToOne
	@JoinColumn(name = "idUilisateur")
	private Utilisateur utilisateur;

}
