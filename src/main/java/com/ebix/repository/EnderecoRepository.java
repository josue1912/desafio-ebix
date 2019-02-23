package com.ebix.repository;

import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ebix.model.Endereco;

@Repository
public class EnderecoRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Endereco> listar() {
		return jdbcTemplate.query("select * from endereco", 
				(rs, rowNum) -> new Endereco(rs.getInt("id"), rs.getString("cep")));
	}
	
	public Endereco buscarPorId(Integer id) {
		Endereco endereco = jdbcTemplate.queryForObject("select * from endereco where id = ?", new Object[]{id}, 
				(rs, rowNum) -> new Endereco(rs.getInt("id"), rs.getString("cep")));
		
		System.out.println("teste");
		return endereco;
	}
	
	public Endereco buscarPorCep(String cep) {
		return jdbcTemplate.queryForObject("select * from endereco where cep = ?", new Object[]{cep}, 
				(rs, rowNum) -> new Endereco(rs.getInt("id"), rs.getString("cep")));
	}

	public void deletarEndereco(Integer id) {
		jdbcTemplate.update("delete from endereco where id = ?", new Object[]{id}, new Object[] {Types.INTEGER});;
	}

	public Endereco alterarEndereco(Endereco endereco) {
		jdbcTemplate.update("update endereco set cep = ? where id = ?", 
				new Object[] {endereco.getCep(), endereco.getId()},
				new Object[] {Types.VARCHAR, Types.INTEGER});
		return endereco;
	}

	public Endereco cadastrarEndereco(Endereco endereco) {
		jdbcTemplate.update("insert into endereco (cep) values(?)", 
				new Object[] {endereco.getCep()},Types.VARCHAR);
		
		return this.buscarPorCep(endereco.getCep());
	}
}
