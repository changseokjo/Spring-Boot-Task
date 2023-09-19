package com.changseok.task.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.changseok.task.dto.request.SchedulePatchRequestBodyDto;
import com.changseok.task.dto.request.SchedulePostRequestBodyDto;
import com.changseok.task.dto.response.ScheduleResponseDto;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {

    // ! 일정 불러오기
    @GetMapping("/{taskNumber}")
    public ResponseEntity<ScheduleResponseDto.getScheduleDto> getScheduleEntity(@PathVariable("taskNumber") Integer taskNumber) {
        ScheduleResponseDto.getScheduleDto responseBody = new ScheduleResponseDto.getScheduleDto("0", "0", 
        null, null, null, null, null, null);
        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }

    // ! 일정 작성하기
    @PostMapping("")
    public ResponseEntity<ScheduleResponseDto.postScheduleDto> postScheduleEntity(@Valid @RequestBody SchedulePostRequestBodyDto requestBody) {
        ScheduleResponseDto.postScheduleDto responseBody = new ScheduleResponseDto.postScheduleDto("1", "2");
        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }

    // ! 일정 수정하기
    @PatchMapping("/{taskNumber}")
    public ResponseEntity<ScheduleResponseDto.patchScheduleDto> patchScheduleEntity(@PathVariable("taskNumber") Integer taskNumber, @Valid @RequestBody SchedulePatchRequestBodyDto requestBody) {
        ScheduleResponseDto.patchScheduleDto responseBody = new ScheduleResponseDto.patchScheduleDto("3", "4");
        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }

    // ! 일정 삭제하기
    @DeleteMapping("/{taskNumber}")
    public ResponseEntity<ScheduleResponseDto.deleteScheduleDto> deleteSchedulEntity(@PathVariable("taskNumber") Integer taskNumber) {
        ScheduleResponseDto.deleteScheduleDto responseBody = new ScheduleResponseDto.deleteScheduleDto("5", "6");
        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }
}
