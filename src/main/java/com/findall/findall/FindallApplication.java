package com.findall.findall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FindallApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindallApplication.class, args);
	}

	@RestController
    public class SimpleController {
        @GetMapping("/")
        public String home() {
            return "Bem-vindo à página inicial!";
        }
    }


}
