package com.fp.quiz.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import com.fp.quiz.entities.User;
import com.fp.quiz.entities.Question;

@Configuration
public class DataRestConfigurer {
    @Bean
    public RepositoryRestConfigurer repositoryRestConfigurer() {

        return new RepositoryRestConfigurer() {

            @Override
            public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
                config.exposeIdsFor(Question.class);
                config.exposeIdsFor((User.class));

            }
        };
    }
}