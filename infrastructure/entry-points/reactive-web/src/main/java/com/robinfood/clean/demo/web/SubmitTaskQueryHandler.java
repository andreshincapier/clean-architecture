package com.robinfood.clean.demo.web;

import com.robinfood.clean.demo.command.SubmitTaskCommandUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/clean-architecture")
@AllArgsConstructor
public class SubmitTaskQueryHandler {

    private final SubmitTaskCommandUseCase useCase;

}
