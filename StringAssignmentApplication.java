package com.pablo.stringassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringAssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(StringAssignmentApplication.class, args);
    }
    @RequestMapping("/")
    public String greet(){
        return "Hello there and Welcome to Jarasic Park!";
    }

    @RequestMapping("/random")
    public String random() {
        return "You have been eaten srry...";
    }

}
