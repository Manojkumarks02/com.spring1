package entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("san.xml");

		Object obj = applicationContext.getBean("sonu");
		Student student = (Student) obj;

		student.test();
	}
	
	

}
