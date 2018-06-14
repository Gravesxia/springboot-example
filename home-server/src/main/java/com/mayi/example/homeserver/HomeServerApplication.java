package com.mayi.example.homeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@Controller
public class HomeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeServerApplication.class, args);
	}

	@RequestMapping("/")
	public String index(){
		return "index";
	}
}
