package com.changseok.task.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class ScheduleResponseDto {

    @Getter
    @AllArgsConstructor
    public static class getScheduleDto{
        private String code;
        private String message;
        private Integer scheduleNumber;
        private String scheduleName;
        private String scheduleCategory;
        private String scheduleExplanation;
        private String scheduleDate;
        private String scheduleTime;
    }

    @Getter
    @AllArgsConstructor
    public static class postScheduleDto{
        private String code;
        private String message;
    }

    @Getter
    @AllArgsConstructor
    public static class patchScheduleDto{
        private String code;
        private String message;
    }
    
    @Getter
    @AllArgsConstructor
    public static class deleteScheduleDto{
        private String code;
        private String message;
    }
}
