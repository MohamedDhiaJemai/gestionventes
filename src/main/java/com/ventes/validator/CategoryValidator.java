package com.ventes.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.ventes.dto.CategoryDto;


public class CategoryValidator {
	
	public static List<String> validate (CategoryDto categoryDto){
		List<String> erros = new ArrayList<>();
		
		if(categoryDto == null) {
			erros.add("Veuillez Renseigner le code de la categorie");
			erros.add("Veuillez Renseigner le designaton de la categorie");
		}
		
		if(!StringUtils.hasLength(categoryDto.getCode())) {
			erros.add("Veuillez Renseigner le code de la categorie");
		}
		
		if(!StringUtils.hasLength(categoryDto.getDesignation())) {
			erros.add("Veuillez Renseigner la designation de la categorie");
		}
		
		return erros;
		
	}

}
