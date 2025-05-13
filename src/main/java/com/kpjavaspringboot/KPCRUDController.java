package com.kpjavaspringboot;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class KPCRUDController {

    //private static Logger logger = LoggerFactory.getLogger(KPJavaSpringBootApplication.class);

    //@Value("${app.title}") // Injecting the value of app.greeting from application.properties
    //private String greeting;

    @GetMapping("/greet")
    public String greet() {
        System.out.println("KP : KPJavaSpringBootApplication Docker Container : KPCRUDController : (REST Controller!) : greet()");
        //logger.info("KP : KPJavaSpringBootApplication : KPCRUDController : greet()");
        //return greeting; // Return the value of app.greeting
        return "KP : KPJavaSpringBootApplication Docker Container : KPCRUDController (REST Controller!) ";
    }
}