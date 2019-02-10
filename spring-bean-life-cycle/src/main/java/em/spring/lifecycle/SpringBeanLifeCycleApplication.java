package em.spring.lifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import em.spring.lifecycle.service.ClienteServiceImplAwareInterface;
import em.spring.lifecycle.service.ClienteServiceImplCustomMethod;

@SpringBootApplication
public class SpringBeanLifeCycleApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean_imp_custom_method.xml");
		
		System.out.println("Context has been initialized");                                        
		ClienteServiceImplCustomMethod service = (ClienteServiceImplCustomMethod) context.getBean("clienteServiceCustomMethod");
		System.out.println("Already retrieved Bean from context. Next, show Bean data.");
		System.out.println("Customer Name: " + service.getCliente().getNombre());
		context.close();
		
		System.out.println("----- new testing context -----");
		System.out.println("----- Spring Aware Interface -----");
		
		context = new ClassPathXmlApplicationContext("bean_imp_aware.xml");
		context.getBean("clienteServiceAware", ClienteServiceImplAwareInterface.class);
		
		//SpringApplication.run(SpringBeanLifeCycleApplication.class, args);
	}

}

