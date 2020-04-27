package model.dao;

import java.util.List;

import model.entidade.Departamento;

public interface DepartamentoDao {
	
	void insert (Departamento obj);
	void update (Departamento obj);
	void deletebyId (Integer id);
	Departamento findbyId(Integer id);
	List<Departamento> findall();
}
