package com.ebix.resource;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.ebix.model.Endereco;
import com.ebix.service.EnderecoService;

@WebService(endpointInterface="com.ebix.resource.IEnderecoWS")
public class EnderecoWS implements IEnderecoWS {

	@Autowired
	EnderecoService enderecoService;
	
	@Override
	public Endereco buscaPorCep(String cep) {
		return enderecoService.buscaPorCep(cep);
	}

	@Override
	public Endereco buscaPorId(Integer id) {
		return enderecoService.buscaPorId(id);
	}

	@Override
	public void deletarEndereco(Integer id) {
		enderecoService.deletarEndereco(id);		
	}

	@Override
	public Endereco alterarEndereco(Endereco endereco) {
		return enderecoService.alterarEndereco(endereco);
	}

	@Override
	public Endereco cadastrarEndereco(Endereco endereco) {
		return enderecoService.cadastrarEndereco(endereco);
	}

}
