package com.ebix.resource;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.ebix.model.Endereco;

@WebService
public interface IEnderecoWS {
	
	@WebMethod
	public Endereco buscaPorCep(@WebParam(name = "cep") String cep);
	
	@WebMethod
	public Endereco buscaPorId(@WebParam(name = "id") Integer id);
	
	@WebMethod
	public void deletarEndereco(@WebParam(name = "id") Integer id);
	
	@WebMethod
	public Endereco alterarEndereco(@WebParam(name = "endereco") Endereco endereco);
	
	@WebMethod
	public Endereco cadastrarEndereco(@WebParam(name = "endereco") Endereco endereco);

}
