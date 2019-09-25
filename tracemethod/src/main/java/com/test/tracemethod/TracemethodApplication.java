package com.test.tracemethod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TracemethodApplication {

	public static void main(String[] args) {
		SpringApplication.run(TracemethodApplication.class, args);
	}

	@Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> tomcatCustomizer() {
        return customizer -> customizer.addConnectorCustomizers(connector -> {
            connector.setAllowTrace(true);
        });
    }
}
