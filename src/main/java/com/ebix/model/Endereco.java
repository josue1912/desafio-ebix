package com.ebix.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "endereco")
public class Endereco implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@XmlAttribute
	private Integer id;
	
	@XmlAttribute
	private String cep;
	
	public Endereco() {
	}

	public Endereco(Integer id, String cep) {
		this.id = id;
		this.cep = cep;
	}

	public String getCep() {
		return cep;
	}
	
	public Integer getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Endereco[id=" + id + ", cep=" + cep + "]";
	}
}
