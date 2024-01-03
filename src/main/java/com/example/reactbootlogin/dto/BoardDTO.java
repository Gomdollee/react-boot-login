package com.example.reactbootlogin.dto;

import com.example.reactbootlogin.entity.Board;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class BoardDTO {

    private Long boardId;
    private String title;
    private String content;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate createDate;


}
