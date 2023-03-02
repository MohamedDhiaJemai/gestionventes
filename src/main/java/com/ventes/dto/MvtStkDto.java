package com.ventes.dto;

import java.math.BigDecimal;
import java.time.Instant;

import javax.persistence.Column;

import com.ventes.utils.TypeMvtStk;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MvtStkDto {
	
	private Integer id;
	
	private Instant dateMvt;
	
	private BigDecimal quantite;

	private ArticleDto article;
	
	@Column(name = "typeMvt")
	private TypeMvtStk typeMvtStk;


}
