package model.dao;

import java.util.List;

import model.entidade.Departamento;
import model.entidade.Vendedor;

public interface VendedorDao {
	
	void insert (Vendedor obj);
	void update (Vendedor obj);
	void deletebyId (Integer id);
	Vendedor findbyId(Integer id);
	List<Vendedor> findall();
	List<Vendedor> findbyDepartamento(Departamento departamento);
}
