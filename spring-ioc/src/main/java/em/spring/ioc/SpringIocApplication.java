package em.spring.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import em.spring.ioc.service.ClienteService;

@SpringBootApplication
public class SpringIocApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		SpringApplication.run(SpringIocApplication.class, args);
		
		ClienteService service = context.getBean(ClienteService.class);
		
		System.out.println(service.LlamarSoporte());
		
		context.close();
		
	}

}

