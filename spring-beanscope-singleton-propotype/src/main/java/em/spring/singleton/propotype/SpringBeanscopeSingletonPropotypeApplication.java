package em.spring.singleton.propotype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import em.spring.singleton.propotype.model.Customer;
import em.spring.singleton.propotype.model.Name;

@SpringBootApplication
public class SpringBeanscopeSingletonPropotypeApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Customer custormer1_1 = (Customer) context.getBean("customer1_1");
		System.out.println(custormer1_1);
		
		Name name1 = (Name) context.getBean("name1");
		name1.setFirstName("Peter");
		name1.setLastName("Pan");
		
		Customer custormer1_2 = (Customer) context.getBean("customer1_2");
		System.out.println(custormer1_2);
		
		Customer custormer2_1 = (Customer) context.getBean("customer2_1");
		System.out.println(custormer2_1);		
		
		Name name2 = (Name) context.getBean("name2");
		name2.setFirstName("Peter");
		name2.setLastName("Pan");
		
		
		Customer custormer2_2 = (Customer) context.getBean("customer2_2");
		System.out.println(custormer2_2);
		
		//SpringApplication.run(SpringBeanscopeSingletonPropotypeApplication.class, args);
	}

}

