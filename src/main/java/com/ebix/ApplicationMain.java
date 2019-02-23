package com.ebix;

import javax.xml.ws.Endpoint;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ebix.resource.CepResource;
import com.ebix.resource.EnderecoWS;

public class ApplicationMain {
	
	private static final Logger log = LoggerFactory.getLogger(ApplicationMain.class);
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan(ApplicationMain.class.getPackage().getName());
	    context.refresh();
	    
	    
		CepResource cepResource = context.getBean(CepResource.class);
		JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
		factoryBean.setResourceClasses(CepResource.class);
		factoryBean.setResourceProvider(CepResource.class, new SingletonResourceProvider(cepResource));
		factoryBean.setAddress("http://localhost:9092/");
		Server server = factoryBean.create();
		log.info("Server is ready...");
		server.start();
	    
	    
	    EnderecoWS bean = context.getBean(EnderecoWS.class);
	    Endpoint.publish("http://localhost:8181/ws/endereco", bean);
	    System.out.println("Rodando...");
	    
	    
	}
}
