package model1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass1 {
	public static void main(String[] args) {


		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bank.xml");
		Object object = applicationContext.getBean("manoj");
		Object object2 = applicationContext.getBean("manoj1");
		Object object3 = applicationContext.getBean("manoj2");

		Bank bank = (Bank) object;
		Bank bank2 = (Bank) object2;
		Bank bank3 = (Bank) object3;
		
		bank.AccountDetails();
		bank2.AccountDetails();
		bank3.AccountDetails();
		

	}

}
