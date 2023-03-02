package com.ventes.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "categories")
public class Category extends AbstractEntity {
	
	@Column(name = "code")
	private String code;

	@Column(name = "designation")
	private String designation;
	
	@OneToMany(mappedBy = "categorie")
	List<Article> articles;

}
