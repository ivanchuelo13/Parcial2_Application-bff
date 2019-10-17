package co.edu.unilibre.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
	
	@Bean("clientRest")
	public RestTemplate registryRestTemplate() {
		return new RestTemplate();
	}
}
