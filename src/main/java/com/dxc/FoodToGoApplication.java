package com.dxc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.dxc.controller","com.dxc.service"})
@EntityScan("com.dxc.entity")
@EnableJpaRepositories("package com.dxc.repository")
public class FoodToGoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodToGoApplication.class, args);
	}

}
