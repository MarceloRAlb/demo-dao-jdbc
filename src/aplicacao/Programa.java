package aplicacao;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entidade.Departamento;
import model.entidade.Vendedor;


public class Programa {

	public static void main(String[] args) {
	
		VendedorDao vendedorDao = DaoFactory.createVendedorDao();
		
		System.out.println("***Teste 1: Vendedor findbyId***");
		Vendedor vendedor = vendedorDao.findbyId(1);
		System.out.println(vendedor);
		
		System.out.println("\n***Teste 2: Vendedor findbydepartamentoId***");
		Departamento departamento = new Departamento(8, null);
		List<Vendedor> list = vendedorDao.findbyDepartamento(departamento);
		for (Vendedor obj : list) {
			System.out.println(obj);
		}
		
		
	}
}
