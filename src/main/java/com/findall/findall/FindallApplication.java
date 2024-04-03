package com.findall.findall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class FindallApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindallApplication.class, args);
	}

	@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}


}
