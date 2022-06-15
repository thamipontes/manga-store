package com.api.mangastore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.mapping.event.ValidatingMongoEventListener;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@org.springframework.context.annotation.Configuration
@EnableMongoRepositories("com.api.mangastore.repository")
public class Configuration {

        @Bean
        public ValidatingMongoEventListener validatingMongoEventListener() {
            return new ValidatingMongoEventListener(validator());
        }

        @Bean
        public LocalValidatorFactoryBean validator() {
            return new LocalValidatorFactoryBean();
        }
}
