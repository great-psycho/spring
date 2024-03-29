package com.sparta.spring_07.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class LectureRequestDto {
    private String title;
    private String tutor;

    // 생성자
    public LectureRequestDto(String title, String tutor) {
        this.title = title;
        this.tutor = tutor;
    }
}
