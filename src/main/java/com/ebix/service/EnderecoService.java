package com.ebix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebix.model.Endereco;
import com.ebix.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;

	public Endereco buscaPorCep(String cep) {
		return enderecoRepository.buscarPorCep(cep);
	}

	public Endereco buscaPorId(Integer id) {
		return enderecoRepository.buscarPorId(id);
	}

	public void deletarEndereco(Integer id) {
		enderecoRepository.deletarEndereco(id);
	}

	public Endereco alterarEndereco(Endereco endereco) {
		return enderecoRepository.alterarEndereco(endereco);
	}

	public Endereco cadastrarEndereco(Endereco endereco) {
		return enderecoRepository.cadastrarEndereco(endereco);
	}

}
