package com.changseok.task.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class DeleteTaskResponseDto extends ResponseDto {
    private String code;
    private String message;

    public DeleteTaskResponseDto(String code, String message) {
        super(code, message);
    }
}
