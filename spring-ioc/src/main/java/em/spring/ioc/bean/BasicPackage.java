package em.spring.ioc.bean;

public class BasicPackage implements ClientePackage {

	@Override
	public String soporte() {
		return "Soporte basico para clientes";
	}

}
