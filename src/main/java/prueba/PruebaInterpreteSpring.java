package prueba;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Traductor;

public class PruebaInterpreteSpring {

	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Traductor traductorES = (Traductor) factory.getBean("traductorEspanol");
		traductorES.hablar();
		
		System.err.println("");
		
		Traductor traductorEN = (Traductor) factory.getBean("traductorIngles");
		traductorEN.hablar();
	}

}
