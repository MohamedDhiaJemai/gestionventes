package com.ventes.dto;

import java.time.Instant;
import java.util.List;

import com.ventes.entities.Client;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CommandeClientDto {
	
	private Integer id;
	
	private String code;

	private Instant dateCommande;

	private Client client;

	private List<LigneCommandeClientDTO> ligneCommandeClients;

}
