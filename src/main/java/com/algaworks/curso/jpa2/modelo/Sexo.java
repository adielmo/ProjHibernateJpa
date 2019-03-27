package com.algaworks.curso.jpa2.modelo;

public enum Sexo {
	
	MASCULINO("Masculino"),
	FEMININO("fEMININO");
	
	private String descricao;

	private Sexo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
 
	
	

}
