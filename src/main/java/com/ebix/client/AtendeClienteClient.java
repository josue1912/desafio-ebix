package com.ebix.client;

import br.com.correios.service.atende.cliente.AtendeCliente;
import br.com.correios.service.atende.cliente.AtendeClienteService;
import br.com.correios.service.atende.cliente.EnderecoERP;

public class AtendeClienteClient {

	public EnderecoERP consultaCep(String cep) throws Exception {
		if (cep == null) {
			throw new IllegalArgumentException("O argumento cep é nulo");
		}
		
		AtendeClienteService service = new AtendeClienteService();
		AtendeCliente client = service.getAtendeClientePort();

		return client.consultaCEP(cep);
	}

}
