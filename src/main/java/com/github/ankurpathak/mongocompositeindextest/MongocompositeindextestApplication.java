package com.github.ankurpathak.mongocompositeindextest;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MongocompositeindextestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongocompositeindextestApplication.class, args);
    }
}


@Component
class Main implements ApplicationRunner{



    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}



@RestController
@RequestMapping("/api")
class MainController {


    @GetMapping("/param/{email}")
    public String ecoEmail(@PathVariable("email") String email){
        return email;
    }

}