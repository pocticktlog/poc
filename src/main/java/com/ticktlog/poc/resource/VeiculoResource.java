package com.ticktlog.poc.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticktlog.poc.dto.SuivVeiculoDto;
import com.ticktlog.poc.service.SuivService;


@RestController
@RequestMapping("/veiculos")
public class VeiculoResource {
	
	
	@Autowired
	private SuivService suivService; 
	
	@GetMapping("/suivConsultaVeiculo/{placa}")
	public ResponseEntity<SuivVeiculoDto> suivConsultaVeiculo(@PathVariable(required=true) String placa) {
		SuivVeiculoDto veiculoDto = suivService.callRestService(placa);
		return veiculoDto != null ? ResponseEntity.ok(veiculoDto) : ResponseEntity.notFound().build();
	}
	
}
