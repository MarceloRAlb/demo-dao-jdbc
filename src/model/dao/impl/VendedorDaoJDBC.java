package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.VendedorDao;
import model.entidade.Departamento;
import model.entidade.Vendedor;

public class VendedorDaoJDBC implements VendedorDao{
	
	private Connection conn;
	public VendedorDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Vendedor obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Vendedor obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletebyId(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vendedor findbyId(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("SELECT vendedores.*, departamento.setor AS depsetor "  
					+"FROM vendedores INNER JOIN departamento "  
					+"ON vendedores.DepartamentoId = departamento.id "  
					+"WHERE vendedores.id = ?");
			
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				Departamento dep = instantiateDepartamento(rs);
				Vendedor obj = instantiateVendedor(rs, dep);
				return obj;
			}
			return null;
	    }
		catch (SQLException e) {
             throw new DbException(e.getMessage());
		}
		finally {
		    DB.closeStatememt(st);
		    DB.closeResultSet(rs);
		}
	}
	
	private Vendedor instantiateVendedor(ResultSet rs, Departamento dep) throws SQLException {
		Vendedor obj = new Vendedor();
		obj.setId(rs.getInt("id"));
		obj.setNome(rs.getString("nome"));
		obj.setEmail(rs.getString("email"));
		obj.setSalariobase(rs.getDouble("salariobase"));
		obj.setDataaniversario(rs.getDate("dataaniversario"));
		obj.setDepartamento(dep); 
		return obj;
	}

	private Departamento instantiateDepartamento(ResultSet rs) throws SQLException {
		Departamento dep = new Departamento();
		dep.setId(rs.getInt("departamentoId"));
		dep.setSetor(rs.getString("depsetor"));
		return dep;
	}

	@Override
	public List<Vendedor> findall() {
		// TODO Auto-generated method stub
		return null;
	}

}
