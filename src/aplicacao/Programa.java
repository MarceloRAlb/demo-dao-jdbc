package aplicacao;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entidade.Vendedor;


public class Programa {

	public static void main(String[] args) {
	
		VendedorDao vendedorDao = DaoFactory.createVendedorDao();
		
		System.out.println("***Teste 1: Vendedor findbyId***");
		Vendedor vendedor = vendedorDao.findbyId(1);
		System.out.println(vendedor);
	}
}
