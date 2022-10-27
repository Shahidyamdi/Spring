package com.tcs.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class CarJavaConfig {

	@Bean
	public Tesla tesla() {

		Tesla tesla = new Tesla();
		tesla.setModel("Roadster sports car");
		tesla.setName("tesla");
		tesla.setPrice(200000.00);
		tesla.setTypeOfcar("car");
		return tesla;

	}

	@Bean
	public Bently bently() {
		Bently bently = new Bently();
		bently.setModel("Continental");
		bently.setName("Bently");
		bently.setPrice(50000.000);
		bently.setTypeofcar("car");
		return bently;
	}

	@Bean
	public Porsche porsche() {
		Porsche porsche = new Porsche();
		porsche.setModel("Porsche Cayman GT4");
		porsche.setName("718 Spyder");
		porsche.setPrice(860000);
		porsche.setTypeofcar("car");

		return porsche;
	}

	@Bean
	public Car car() {
		Car car = new Car("csAutomotive", tesla(), bently(), porsche());
		return car;
	}

}
