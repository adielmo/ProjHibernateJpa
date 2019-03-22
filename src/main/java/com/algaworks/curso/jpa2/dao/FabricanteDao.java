package com.algaworks.curso.jpa2.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.algaworks.curso.jpa2.modelo.Fabricante;
import com.algaworks.curso.jpa2.service.NegocioExection;
import com.algaworks.curso.jpa2.util.jpa.Transactional;

public class FabricanteDao implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager em;
	
	public void salvar(Fabricante fabricante) {
		em.merge(fabricante);
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Fabricante> buscarTodas(){
		return em.createQuery("from Fabricante").getResultList();
	}
	
	@Transactional
	public void excluir(Fabricante fabricante) throws NegocioExection {
		Fabricante fabricanteTemp = em.find(Fabricante.class, fabricante.getCodigo());
		
		em.remove(fabricanteTemp);
		em.flush();
	}

	@Transactional
	public Fabricante buscarPeloCodigo(Long codigo) {
		
		return em.find(Fabricante.class, codigo);
	}

}