package com.ventes.entities;

import java.math.BigDecimal;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ventes.utils.TypeMvtStk;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "mvtStock")
public class MvtStock extends AbstractEntity {
	
	private Instant dateMvt;
	
	private BigDecimal quantite;


	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@Column(name = "typeMvt")
	private TypeMvtStk typeMvtStk;

}
