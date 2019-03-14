package com.github.salex89.sotcdemo;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class SotcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SotcDemoApplication.class, args);
    }

    @RequestMapping("/game")
    public String game() {
        return "index";
    }

}
