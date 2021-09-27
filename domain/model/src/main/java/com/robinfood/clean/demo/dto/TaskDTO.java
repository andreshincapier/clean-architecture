package com.robinfood.clean.demo.dto;

import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class TaskDTO {

    private String message;
}
