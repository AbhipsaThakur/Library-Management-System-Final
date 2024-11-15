package com.example.springsecurity.test.librarymanagementsystemfinal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthorUpdateDTO {
    private int authorid;
    private String authorname;
}
