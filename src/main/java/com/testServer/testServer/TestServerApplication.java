package com.testServer.testServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestServerApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "Taylor") String name,
						@RequestParam(value = "name", defaultValue = "27") String age) {
		int ageInt = Integer.parseInt(age);
		return String.format("Hello %s! Age %d", name, ageInt);
	}
}