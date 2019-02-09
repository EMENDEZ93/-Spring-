package em.spring.ioc.service;

import em.spring.ioc.bean.ClientePackage;

public class ClienteService {

	ClientePackage clientePackage; 
	
	//injeccion
	public void setClientePackage(ClientePackage clientePackage) {
		this.clientePackage = clientePackage;
	}
	
	public String LlamarSoporte() {
		return clientePackage.soporte();
	}
	
}
