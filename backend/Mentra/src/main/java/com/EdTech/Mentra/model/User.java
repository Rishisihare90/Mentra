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

    private boolean isVerified;

    public User(String bio, String email, String firstName, boolean isVerified, String lastName, String location, String password, String profilePicUrl) {
        this.bio = bio;
        this.email = email;
        this.firstName = firstName;
        this.isVerified = isVerified;
        this.lastName = lastName;
        this.location = location;
        this.password = password;
        this.profilePicUrl = profilePicUrl;
    }
}
