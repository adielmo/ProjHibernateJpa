package com.algaworks.curso.jpa2.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.algaworks.curso.jpa2.dao.FabricanteDao;
import com.algaworks.curso.jpa2.modelo.Fabricante;
import com.algaworks.curso.jpa2.util.jpa.Transactional;

public class CadastroFabricanteService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private FabricanteDao fabricanteDao;
	
	@Transactional
	public void salvar(Fabricante fabricante) throws NegocioExection{
		if (fabricante.getNome() ==null || fabricante.getNome().trim().equals("")) {
			throw new NegocioExection("O nome do fabricante é obrigatório!");
		}
		this.fabricanteDao.salvar(fabricante);
	}

}