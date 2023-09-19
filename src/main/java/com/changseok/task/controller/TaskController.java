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

import com.changseok.task.dto.request.PatchTaskRequestBodyDto;
import com.changseok.task.dto.request.PostTaskRequestBodyDto;
import com.changseok.task.dto.response.DeleteTaskResponseDto;
import com.changseok.task.dto.response.GetTaskResponseDto;
import com.changseok.task.dto.response.PatchTaskResponseDto;
import com.changseok.task.dto.response.PostTaskResponseDto;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {

    // ! 일정 불러오기
    @GetMapping("/{taskNumber}")
    public ResponseEntity<GetTaskResponseDto> getScheduleEntity(@PathVariable("taskNumber") Integer taskNumber) {
        return null;
    }

    // ! 일정 작성하기
    @PostMapping("")
    public ResponseEntity<PostTaskResponseDto> postScheduleEntity(@Valid @RequestBody PostTaskRequestBodyDto requestBody) {
        return null;
    }

    // ! 일정 수정하기
    @PatchMapping("/{taskNumber}")
    public ResponseEntity<PatchTaskResponseDto> patchScheduleEntity(@PathVariable("taskNumber") Integer taskNumber, @Valid @RequestBody PatchTaskRequestBodyDto requestBody) {
        return null;
    }

    // ! 일정 삭제하기
    @DeleteMapping("/{taskNumber}")
    public ResponseEntity<DeleteTaskResponseDto> deleteSchedulEntity(@PathVariable("taskNumber") Integer taskNumber) {
        return null;
    }
}
