package com.hurricane.app.file.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@ServletComponentScan
public class App {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(App.class, args);
	}
}
