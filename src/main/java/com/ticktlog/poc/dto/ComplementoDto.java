package com.ticktlog.poc.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ComplementoDto implements Serializable {

	private static final long serialVersionUID = 1608363360341928056L;
	
	private String fipe;
	private String descAno;
	private String combustivel;
	private String preco;
	
	public String getFipe() {
		return fipe;
	}
	public void setFipe(String fipe) {
		this.fipe = fipe;
	}
	public String getDescAno() {
		return descAno;
	}
	public void setDescAno(String descAno) {
		this.descAno = descAno;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((combustivel == null) ? 0 : combustivel.hashCode());
		result = prime * result + ((descAno == null) ? 0 : descAno.hashCode());
		result = prime * result + ((fipe == null) ? 0 : fipe.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComplementoDto other = (ComplementoDto) obj;
		if (combustivel == null) {
			if (other.combustivel != null)
				return false;
		} else if (!combustivel.equals(other.combustivel))
			return false;
		if (descAno == null) {
			if (other.descAno != null)
				return false;
		} else if (!descAno.equals(other.descAno))
			return false;
		if (fipe == null) {
			if (other.fipe != null)
				return false;
		} else if (!fipe.equals(other.fipe))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Complemento [fipe=" + fipe + ", descAno=" + descAno + ", combustivel=" + combustivel + ", preco="
				+ preco + "]";
	}
	
	
	
}
