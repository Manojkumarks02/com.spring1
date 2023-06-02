package model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {
	public static void main(String[] args) {
		Resource rs=  new ClassPathResource("confi1.xml");
		BeanFactory b = new XmlBeanFactory(rs);
		
		Employee emp = (Employee) b.getBean("ram");
		emp.empDetails();
		
	
	}

}
