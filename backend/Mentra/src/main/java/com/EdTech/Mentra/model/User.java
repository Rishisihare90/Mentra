package com.EdTech.Mentra.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "users",
        uniqueConstraints = {
        @UniqueConstraint(columnNames = "email")
        })
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @NotBlank
    @Size(max = 20)
    @Column(name = "firstname")
    private String firstName;

    @NotBlank
    @Size(max = 20)
    @Column(name = "lastname")
    private String lastName;

    @Email
    @Size(max = 50)
    @NotBlank
    @Column(name = "email")
    private String email;

    @NotBlank
    @Size(max = 120)
    @Column(name = "password")
    private String password;

    private String profilePicUrl;
    private String bio;
    @NotBlank
    private String location;

    public User(String firstName, String lastName, String email, String password, String location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.location = location;
    }

    private boolean isVerified;



}
