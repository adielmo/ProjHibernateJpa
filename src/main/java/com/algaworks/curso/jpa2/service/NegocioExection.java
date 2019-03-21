package com.algaworks.curso.jpa2.service;

public class NegocioExection extends Exception {

		private static final long serialVersionUID = 1L;
		
		public NegocioExection(String messege) {
			super(messege);
		}

}
