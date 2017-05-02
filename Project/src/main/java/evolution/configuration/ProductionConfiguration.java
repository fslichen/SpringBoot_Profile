package evolution.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import evolution.bean.AnyBean;

@Profile("production")// Use this profile if spring.profiles.active = production in application.properties.
@Configuration
public class ProductionConfiguration {
	@Bean// AnyBean is not a prototype because get() method doesn't create a new instance.
	public AnyBean anyBean0() {
		return new AnyBean("Production : anyBean0");
	}
	
	@Bean// By default, the bean is a singleton.
	public AnyBean anyBean1() {
		return new AnyBean("Production : anyBean1");
	}
}
