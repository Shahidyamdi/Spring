package com.tcs.beans;

import org.springframework.context.annotation.Bean;

public class CarJavaConfig {

	@Bean
	public Tesla getTesla() {
		return new Tesla("tesla", "Roadster sports car", "sports car", 200000.00);

	}

	@Bean
	public Bently getBently() {
		return new Bently("Bently", "Continental", "Extended Wheelbase", 50000.00);

	}

	@Bean
	public Porsche getProsche() {
		// constructor - parameterized injection
		return new Porsche("Porsche Cayman GT4", "718 Spyder", "Electric car", 86000);
	}

	@Bean
	public Car getCar() {

		// Constructor injection
		return new Car("csAutomotive", getTesla(), getBently(), getProsche());

	}

}
