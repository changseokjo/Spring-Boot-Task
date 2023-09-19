package com.changseok.task.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetTaskResponseDto extends ResponseDto {

    private Integer scheduleNumber;
    private String scheduleName;
    private String scheduleCategory;
    private String scheduleExplanation;
    private String scheduleDate;
    private String scheduleTime;

}
