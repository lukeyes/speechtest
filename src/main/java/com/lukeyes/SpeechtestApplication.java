package com.lukeyes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpeechtestApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpeechtestApplication.class, args);
		ConfigurableApplicationContext context =
                new SpringApplicationBuilder(SpeechtestApplication.class).headless(false).run(args);

		AppPrincipalFrame appFrame = context.getBean(AppPrincipalFrame.class);
        appFrame.setVisible(true);
	}
}
