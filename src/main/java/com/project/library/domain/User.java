package com.project.library.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@Data
public class User {
    private Long id;
    private String name;
    private String lastName;
    private LocalDate createdAccount;
}