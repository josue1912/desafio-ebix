package com.ebix.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import com.ebix.repository.EnderecoRepository;
import com.ebix.resource.CepResource;
import com.ebix.resource.EnderecoWS;
import com.ebix.service.EnderecoService;

@Configuration
public class Config {
	
	@Bean
	public EnderecoRepository getEnderecoRepository() {
		return new EnderecoRepository();
	}
	
	@Bean
	public EnderecoService getEnderecoService() {
		return new EnderecoService();
	}	
	
	@Bean
	public EnderecoWS getEndereceWS() {
		return new EnderecoWS();
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
	
	@Bean
	public CepResource getCepResource() {
		return new CepResource();
	}
	
	@Bean
	public DataSource getDataSource() {
		return new EmbeddedDatabaseBuilder()
				.generateUniqueName(true)
				.setType(EmbeddedDatabaseType.H2)
				.setScriptEncoding("UTF-8")
				.addScript("bd/script.sql")
				.build();
	}
	
	
}
