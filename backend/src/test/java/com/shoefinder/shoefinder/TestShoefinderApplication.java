package com.shoefinder.shoefinder;

import org.springframework.boot.SpringApplication;

public class TestShoefinderApplication {

	public static void main(String[] args) {
		SpringApplication.from(ShoefinderApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
