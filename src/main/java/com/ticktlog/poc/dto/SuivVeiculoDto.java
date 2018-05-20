package com.ticktlog.poc.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown=true)
public class SuivVeiculoDto implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private String placa;
	private String marca;
	private String modelo;
	private String versao;
	private String anoFab;
	private String anoMod;
	private String combustivel;
	private String segmento;
	private String subsegmento;
	private String carroceria;
	private String potencia;
	private String procedencia;
	private String eixosQtd;
	private String pBT;
	private String cMT;
	private String motorizacao;
	private String numLugares;
	private String capacCarga;
	private String numCaixaCambio;
	private String numEixoTras;
	private String numEixoAux;
	private String numMotor;
	private List<ComplementoDto> complemento;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getVersao() {
		return versao;
	}
	public void setVersao(String versao) {
		this.versao = versao;
	}
	public String getAnoFab() {
		return anoFab;
	}
	public void setAnoFab(String anoFab) {
		this.anoFab = anoFab;
	}
	public String getAnoMod() {
		return anoMod;
	}
	public void setAnoMod(String anoMod) {
		this.anoMod = anoMod;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public String getSubsegmento() {
		return subsegmento;
	}
	public void setSubsegmento(String subsegmento) {
		this.subsegmento = subsegmento;
	}
	public String getCarroceria() {
		return carroceria;
	}
	public void setCarroceria(String carroceria) {
		this.carroceria = carroceria;
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public String getEixosQtd() {
		return eixosQtd;
	}
	public void setEixosQtd(String eixosQtd) {
		this.eixosQtd = eixosQtd;
	}
	public String getpBT() {
		return pBT;
	}
	public void setpBT(String pBT) {
		this.pBT = pBT;
	}
	public String getcMT() {
		return cMT;
	}
	public void setcMT(String cMT) {
		this.cMT = cMT;
	}
	public String getMotorizacao() {
		return motorizacao;
	}
	public void setMotorizacao(String motorizacao) {
		this.motorizacao = motorizacao;
	}
	public String getNumLugares() {
		return numLugares;
	}
	public void setNumLugares(String numLugares) {
		this.numLugares = numLugares;
	}
	public String getCapacCarga() {
		return capacCarga;
	}
	public void setCapacCarga(String capacCarga) {
		this.capacCarga = capacCarga;
	}
	public String getNumCaixaCambio() {
		return numCaixaCambio;
	}
	public void setNumCaixaCambio(String numCaixaCambio) {
		this.numCaixaCambio = numCaixaCambio;
	}
	public String getNumEixoTras() {
		return numEixoTras;
	}
	public void setNumEixoTras(String numEixoTras) {
		this.numEixoTras = numEixoTras;
	}
	public String getNumEixoAux() {
		return numEixoAux;
	}
	public void setNumEixoAux(String numEixoAux) {
		this.numEixoAux = numEixoAux;
	}
	public String getNumMotor() {
		return numMotor;
	}
	public void setNumMotor(String numMotor) {
		this.numMotor = numMotor;
	}
	public List<ComplementoDto> getComplemento() {
		return complemento;
	}
	public void setComplemento(List<ComplementoDto> complemento) {
		this.complemento = complemento;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
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
		SuivVeiculoDto other = (SuivVeiculoDto) obj;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SuivVeiculoDto [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", versao=" + versao
				+ ", anoFab=" + anoFab + ", anoMod=" + anoMod + ", combustivel=" + combustivel + ", segmento="
				+ segmento + ", subsegmento=" + subsegmento + ", carroceria=" + carroceria + ", potencia=" + potencia
				+ ", procedencia=" + procedencia + ", eixosQtd=" + eixosQtd + ", pBT=" + pBT + ", cMT=" + cMT
				+ ", motorizacao=" + motorizacao + ", numLugares=" + numLugares + ", capacCarga=" + capacCarga
				+ ", numCaixaCambio=" + numCaixaCambio + ", numEixoTras=" + numEixoTras + ", numEixoAux=" + numEixoAux
				+ ", numMotor=" + numMotor + ", complemento=" + complemento + "]";
	}
	
	
	

	
	
	
	
	
}
