package com.ventes.entities;

import java.time.Instant;

import javax.persistence.Entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
public class Ventes extends AbstractEntity {

	private String code;

	private Instant dateVente;
	
	private String commentaire;
}
