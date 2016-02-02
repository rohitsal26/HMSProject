package com.java.hms.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.java.hms.main","com.java.hms.endpoint"})
public class Application {
	
	@RequestMapping("/")
	public String sayHello(){
		return "Application version is "+versionService.getVersion();
	}
	
	@Autowired
	private VersionService versionService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
