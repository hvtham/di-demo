package com.example.didemo;

import com.example.didemo.controllers.ConstructorInjectedController;
import com.example.didemo.controllers.MyController;
import com.example.didemo.controllers.PropertyInjectedController;
import com.example.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.sayHello());

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.sayHello());

        PropertyInjectedController propertiesInjectedController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
        System.out.println(propertiesInjectedController.sayHello());

        MyController controller = (MyController) ctx.getBean("myController");
        System.out.println(controller.hello());


    }

}
