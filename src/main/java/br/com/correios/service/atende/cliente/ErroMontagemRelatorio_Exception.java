
package br.com.correios.service.atende.cliente;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.0
 * 2019-02-22T14:27:41.740-03:00
 * Generated source version: 3.3.0
 */

@WebFault(name = "ErroMontagemRelatorio", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/")
public class ErroMontagemRelatorio_Exception extends java.lang.Exception {

    private br.com.correios.service.atende.cliente.ErroMontagemRelatorio erroMontagemRelatorio;

    public ErroMontagemRelatorio_Exception() {
        super();
    }

    public ErroMontagemRelatorio_Exception(String message) {
        super(message);
    }

    public ErroMontagemRelatorio_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ErroMontagemRelatorio_Exception(String message, br.com.correios.service.atende.cliente.ErroMontagemRelatorio erroMontagemRelatorio) {
        super(message);
        this.erroMontagemRelatorio = erroMontagemRelatorio;
    }

    public ErroMontagemRelatorio_Exception(String message, br.com.correios.service.atende.cliente.ErroMontagemRelatorio erroMontagemRelatorio, java.lang.Throwable cause) {
        super(message, cause);
        this.erroMontagemRelatorio = erroMontagemRelatorio;
    }

    public br.com.correios.service.atende.cliente.ErroMontagemRelatorio getFaultInfo() {
        return this.erroMontagemRelatorio;
    }
}