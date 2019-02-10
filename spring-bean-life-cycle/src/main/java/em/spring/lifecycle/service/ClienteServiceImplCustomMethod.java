package em.spring.lifecycle.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import em.spring.lifecycle.bean.Cliente;

public class ClienteServiceImplCustomMethod implements InitializingBean, DisposableBean {

	private Cliente cliente;

	public ClienteServiceImplCustomMethod() {
		System.out.println("llamando al constructor ClienteServiceImplCustomMethod");
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("destroy(): Bean destruction here");
	}

	@Override
	public void destroy() throws Exception {
	}

	public void clienteInitBean() throws Exception {
		System.out.println("clienteInitBean()");
	}

	public void clienteDestroyBean() throws Exception {
		System.out.println("clienteDestroyBean()");
	}

	@PostConstruct
	public void postConstruct() {
		System.out
				.println("post-construct(): perform some initialization after all the setter methods have been called");
	}

	@PreDestroy
	public void predestroy() {
		System.out.println("pre-destroy()");
	}
	
}
