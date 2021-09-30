package com.robinfood.clean.demo;


import com.robinfood.clean.demo.command.SubmitTaskCommandUseCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.reactivecommons.utils.ObjectMapper;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class UseCaseConfigTest {

    @InjectMocks
    UseCaseConfig useCaseConfig;
    
    @Test
    public void objectMapperIsNotNull() {
        ObjectMapper objectMapper = useCaseConfig.objectMapper();
        assertThat(objectMapper).isNotNull();
    }

    @Test
    public void surveyUseCase() {
        SubmitTaskCommandUseCase submitTaskCommandUseCase = useCaseConfig.submitTaskCommandUseCase();
        assertThat(submitTaskCommandUseCase).isNotNull();
    }
}