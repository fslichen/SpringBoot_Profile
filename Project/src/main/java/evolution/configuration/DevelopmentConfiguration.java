package evolution.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import evolution.bean.AnyBean;

@Profile("development")// Use this profile if spring.profiles.active = development in application.properties.
@Configuration
public class DevelopmentConfiguration {
	@Bean
	public AnyBean anyBean() {
		return new AnyBean("development");
	}
}
