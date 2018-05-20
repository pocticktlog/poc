package com.ticktlog.poc.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ticktlog.poc.config.SuivConfig;
import com.ticktlog.poc.dto.SuivVeiculoDto;


@Service
public class SuivService  {
	
	@Autowired
	private SuivConfig suivConfig;
	
	public SuivVeiculoDto callRestService(String placa) {
		RestTemplate restTemplate = new RestTemplate();
		//return parseJson(restTemplate.getForObject(suivConfig.getURL(placa), String.class));
		return parseJson("");
	}	

	public SuivVeiculoDto parseJson(String json) {
		ObjectMapper mapper = new ObjectMapper();
		 try {
			 
			 File file = new File("C:\\Users\\franc\\Documents\\json.txt");
			 mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
			 SuivVeiculoDto t = mapper.reader().forType(SuivVeiculoDto.class).readValue(file);
			 System.out.println(t);
			 return t;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
