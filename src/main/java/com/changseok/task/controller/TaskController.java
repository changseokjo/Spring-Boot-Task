package com.changseok.task.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.changseok.task.dto.request.RequestBodyDto;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {

    @GetMapping("/{taskNumber}")
    public String get_Schedule() {
        return "get입니다.";
    }

    @PostMapping("")
    public String post_Schedule(@RequestBody RequestBodyDto requestBody) {
        return "PostData = 일정이름: " + requestBody.getScheduleName() + ", 카테고리: " + requestBody.getSchedulCategory() 
        + ", 설명: " + requestBody.getSchedulExplanation() + ", 날짜: " + requestBody.getScheduleDate() + ", 시간: " + requestBody.getScheduleTime() + " 입니다.";
    }

    @PatchMapping("/{taskNumber}")
    public String patch_Schedule(@RequestBody RequestBodyDto requestBody) {
        return "PatctData = 일정이름: " + requestBody.getScheduleName() + ", 카테고리: " + requestBody.getSchedulCategory() 
        + ", 설명: " + requestBody.getSchedulExplanation() + ", 날짜: " + requestBody.getScheduleDate() + ", 시간: " + requestBody.getScheduleTime() + " 입니다.";
    }

    @DeleteMapping("/{taskNumber}")
    public String delete_Schedule() {
        return "delete입니다.";
    }
}
