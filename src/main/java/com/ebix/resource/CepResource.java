package com.ebix.resource;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ebix.client.AtendeClienteClient;

import br.com.correios.service.atende.cliente.EnderecoERP;

@Path("/correios")
public class CepResource {

	@GET
	@Path("/consulta/{cep}")
	@Produces({ MediaType.APPLICATION_XML })
	public Response consultaCep(@NotNull @PathParam("cep") String cep) throws Exception {

		AtendeClienteClient client = new AtendeClienteClient();
		EnderecoERP retornoConsultaCEP = client.consultaCep(cep);

		if (retornoConsultaCEP == null) {
			Response.status(Response.Status.NOT_FOUND);
		}

		return Response.ok(retornoConsultaCEP).build();
	}
}