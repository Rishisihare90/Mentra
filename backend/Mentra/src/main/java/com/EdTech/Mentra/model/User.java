package com.EdTech.Mentra.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
