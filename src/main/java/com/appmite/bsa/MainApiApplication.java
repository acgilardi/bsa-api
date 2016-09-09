package com.appmite.bsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class MainApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(MainApiApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "Proudly handcrafted by " +
				"<a href='http://netgloo.com/en'>Netgloo</a> :)";
	}
}
