package com.changseok.task.dto.request;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

// ! 일정이름, 카테고리, 설명, 날짜, 시간, 일정번호
public class SchedulePatchRequestBodyDto {
    @NotBlank
    private String scheduleName;
    @NotBlank
    private String scheduleCategory;
    @NotBlank
    private String scheduleExplanation;
    @NotBlank
    private String scheduleDate;
    @NotBlank
    private String scheduleTime;
    
    private Integer scheduleNumber;
}
