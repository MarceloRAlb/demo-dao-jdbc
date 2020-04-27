package aplicacao;

import java.util.Date;

import model.entidade.Departamento;
import model.entidade.Vendedor;

public class Programa {

	public static void main(String[] args) {
	
		Departamento obj = new Departamento(1, "periféricos");
		
		Vendedor vendedor = new Vendedor(21,"Marcelo", "marcelo@gmail.com", new Date(), obj);
		
		System.out.println(vendedor);

	}

}
