package com.changseok.task.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostTaskResponseDto extends ResponseDto {
    private String code;
    private String message;

    public PostTaskResponseDto(String code, String message) {
        super(code, message);
    }
}
