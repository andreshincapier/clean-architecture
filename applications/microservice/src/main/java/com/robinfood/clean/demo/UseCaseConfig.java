package com.robinfood.clean.demo;

import com.robinfood.clean.demo.command.SubmitTaskCommandUseCase;
import org.reactivecommons.utils.ObjectMapper;
import org.reactivecommons.utils.ObjectMapperImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapperImp();
    }

    @Bean
    public SubmitTaskCommandUseCase submitTaskCommandUseCase() {
        return new SubmitTaskCommandUseCase();
    }
}
