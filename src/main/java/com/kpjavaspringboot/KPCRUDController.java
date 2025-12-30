package com.kpjavaspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@RestController
public class KPCRUDController {

    private static Logger logger = LoggerFactory.getLogger(KPCRUDController.class);

    //@Value("${app.title}") // Injecting the value of app.greeting from application.properties
    //private String greeting;

    @GetMapping("/greet")
    public String greet() {
        System.out.println("KP : KPJavaSpringBootApplication Docker Container : " +
                "KPCRUDController : (REST Controller!) : greet() : " + LocalDateTime.now()
        );
        //logger.info("KP : KPJavaSpringBootApplication : KPCRUDController : greet()");
        //return greeting; // Return the value of app.greeting
        return "KP : KPJavaSpringBootApplication Docker Container : " +
                "KPCRUDController (REST Controller!) : " + LocalDateTime.now()  ;
    }

    //    // on the below line we are adding a post mapping annotation
    //    // and passing the end point to it on which
    //    // we have to make a post request.
    //    @PostMapping("/addStudent")
    //    public Student addStudent(@RequestBody String studentName) {
    //        return "Hello, "+studentName;
    //    }

    //    @PostMapping("/students/{id}")
    //    public void updateStudent(@PathVariable("id") String id, @RequestBody Student student) {
    //        // Update the student record here.
    //    }

    // on the below line we are adding a post mapping annotation
    // and passing the end point to it on which
    // we have to make a post request.
    @PostMapping("/greetPerson")
    public String greetPerson(@RequestBody String personName) {

        System.out.println("KP : KPJavaSpringBootApplication Docker Container : " +
                "KPCRUDController : (REST Controller!) :  @PostMapping(\"/greetPerson\") : " +
                "Hello, "+personName + " " +   LocalDateTime.now()
        );

        //return "Hello, "+personName;
        logger.info("KP : KPJavaSpringBootApplication : KPCRUDController : greet() : Hello, "
                +personName  + " " +   LocalDateTime.now());
        //return greeting; // Return the value of app.greeting
        return "KP : KPJavaSpringBootApplication Docker Container : " +
                "KPCRUDController (REST Controller!) : " +
                personName + LocalDateTime.now()  ;

    }

}