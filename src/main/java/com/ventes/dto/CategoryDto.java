package com.ventes.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ventes.entities.Category;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CategoryDto {

	private Integer id;

	private String code;

	private String designation;

	@JsonIgnore
	List<ArticleDto> articles;

	public CategoryDto fromEntity(Category category) {

		if (category == null) {
			return null;
		}

		return CategoryDto.builder().id(category.getId()).code(category.getCode())
				.designation(category.getDesignation()).build();
	}
	
	public Category toEntity(CategoryDto categoryDto) {
		if(categoryDto == null) {
			return null;
		}
		
		Category category = new Category();
		category.setId(categoryDto.getId());
		category.setCode(categoryDto.getCode());
		category.setDesignation(categoryDto.getDesignation());
		
		return category;
	}

}
