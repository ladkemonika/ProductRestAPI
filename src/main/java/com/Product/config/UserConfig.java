package com.Product.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserConfig {

	@Bean
	public InMemoryUserDetailsManager userDetailsService(PasswordEncoder encoder) {
	    UserDetails user = User.withUsername("admin")
	                           .password(encoder.encode("admin123"))
	                           .roles("USER")
	                           .build();
	    return new InMemoryUserDetailsManager(user);
	}
}
