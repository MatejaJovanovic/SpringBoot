package io.springboot.maven.initial;
import io.springboot.maven.initial.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class HelloWorld {
@Autowired
    private LanguageRepository langRepository;

public static void main(String [] args){
    SpringApplication.run(HelloWorld.class,args);
}
@PostConstruct
    private void postInit(){
    System.out.println("All available languages are : "+ langRepository.findAll());
}
}
