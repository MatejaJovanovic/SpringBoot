package io.springboot.maven.initial.hello;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController {

    @RequestMapping("/hello-rest")
    public String helloWorld(){


        return "Hello World";
    }
    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorldHTML(){

         return "Hello World";
    }

}
