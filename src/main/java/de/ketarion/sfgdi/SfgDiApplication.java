package de.ketarion.sfgdi;

import de.ketarion.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayGreeting());

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println("------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------- Setter");
		SetterInjectedController setterInjectedContoller = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedContoller.getGreeting());

		System.out.println("------- Constructor");
		ConstructorInjectedController controller = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(controller.getGreeting());

  	}

}
