package com.changseok.task.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RequestBodyDto {
    private String scheduleName;
    private String schedulCategory;
    private String schedulExplanation;
    private String scheduleDate;
    private String scheduleTime;
}
