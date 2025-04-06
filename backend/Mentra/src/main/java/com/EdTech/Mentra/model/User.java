package com.EdTech.Mentra.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.print.attribute.standard.DateTimeAtCreation;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "users",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"email", "username"})
        })
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @NotBlank
    @Size(max = 50)
    @Column(name = "username")
    private String username;


    @Email
    @Size(max = 100)
    @NotBlank
    @Column(name = "email")
    private String email;


    @NotBlank
    @Size(max = 255)
    @Column(name = "password")
    private String password;


    @NotBlank
    @Size(max = 50)
    @Column(name = "firstname")
    private String firstName;

    @NotBlank
    @Size(max = 50)
    @Column(name = "lastname")
    private String lastName;

    private String bio;

    private String profilePic;
    @Size(max = 100)
    private String location;
    @Size(max = 100)
    private String job_title;
    @Size(max = 100)
    private String company;

    private DateTimeAtCreation createdAt;
    private DateTimeAtCompleted updatedAt;

    private DateTimeAtCompleted lastActive;

    @ToString.Exclude
    @OneToMany(mappedBy = "user",
            cascade = {CascadeType.ALL}, orphanRemoval = true)
    private List<UserSkills> userSkills;

    @ToString.Exclude
    @OneToMany(mappedBy = "user",
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Connections> userConnections;

    @ToString.Exclude
    @OneToMany(mappedBy = "peer",
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Connections> peerConnections;

    @ToString.Exclude
    @OneToMany(mappedBy = "sender",
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Messages> sendMessages;

    @ToString.Exclude
    @OneToMany(mappedBy = "receiver",
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Messages> receivedMessages;

}
