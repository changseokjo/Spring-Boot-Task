package com.changseok.task.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PatchTaskResponseDto extends ResponseDto {
    private String code;
    private String message;

    public PatchTaskResponseDto(String code, String message) {
        super(code, message);
    }
}
