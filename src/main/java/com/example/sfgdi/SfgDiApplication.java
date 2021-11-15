package com.example.sfgdi;

import com.example.sfgdi.controllers.ConstructorInjectedController;
import com.example.sfgdi.controllers.I18nController;
import com.example.sfgdi.controllers.MyController;
import com.example.sfgdi.controllers.SetterinjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println("---I18nController");
		System.out.println(i18nController.sayhello());

		MyController myController = (MyController) context.getBean("myController");
		System.out.println("--Primary Beans");
		System.out.println(myController.sayHello());

		ConstructorInjectedController controller = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println("---Constructor");
		System.out.println(controller.getGreeting());

		SetterinjectedController setterinjectedController = (SetterinjectedController) context.getBean("setterinjectedController");
		System.out.println("--Setter");
		System.out.println(setterinjectedController.getGreetings());
	}
}
