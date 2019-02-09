package em.spring.ioc.bean;

public class NegociosPackage implements ClientePackage {

	@Override
	public String soporte() {
		return "Soporte Negocios para clientes";
	}

}
