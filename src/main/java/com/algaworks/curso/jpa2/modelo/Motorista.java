package com.algaworks.curso.jpa2.modelo;

<<<<<<< HEAD
public class Motorista {

=======
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MOTORISTA")
public class Motorista extends Pessoa {

	private String numeroCNH;

	public String getNumeroCNH() {
		return numeroCNH;
	}

	public void setNumeroCNH(String numeroCNH) {
		this.numeroCNH = numeroCNH;
<<<<<<< HEAD
	}	
	
	
>>>>>>> master
}
=======
	}

}
>>>>>>> master
