package es.seresco.delincuencia.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MessagesConfiguration {
	
	
	@Bean
	public MessageSource messageSource () {
		
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("messages/messages");
		source.setFallbackToSystemLocale(false);
		source.setUseCodeAsDefaultMessage(true);
		return source;
	} 
	
	
}
