package com.ticktlog.poc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;


import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("suiv")
public class SuivConfig {
	
	private String url;
	private String token;
	private String paramPlaca;
	private String originPermitida = "http://localhost:4200";
	
	public String getURL(String placa) {
		return url+token+paramPlaca+placa;
	}
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getParamPlaca() {
		return paramPlaca;
	}
	public void setParamPlaca(String paramPlaca) {
		this.paramPlaca = paramPlaca;
	}


	public String getOriginPermitida() {
		return originPermitida;
	}


	public void setOriginPermitida(String originPermitida) {
		this.originPermitida = originPermitida;
	}
	
	
	
	
}
