package com.EdTech.Mentra.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.text.DecimalFormat;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user_profiles")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profile_id")
    private Long profileId;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;


    @Column(length = 150)
    private String headline;

    @Column(columnDefinition = "TEXT")
    private String about;

    @Column(columnDefinition = "TEXT")
    private String experience;

    @Column(columnDefinition = "TEXT")
    private String education;

    @Column(columnDefinition = "TEXT")
    private String achievements;

    @Column(columnDefinition = "json")
    private String availability;

    @Column(precision = 3, scale = 2)
    private DecimalFormat rating;

    @ToString.Exclude
    @Enumerated(EnumType.STRING)
    private MentorStatus mentor_status;

    @ToString.Exclude
    @Enumerated(EnumType.STRING)
    private MenteeStatus menteeStatus;

    public UserProfile(User user, MentorStatus mentor_status, MenteeStatus menteeStatus, String headline, String experience, String about, String education, String achievements, String availability, DecimalFormat rating) {
        this.user = user;
        this.mentor_status = mentor_status;
        this.menteeStatus = menteeStatus;
        this.headline = headline;
        this.experience = experience;
        this.about = about;
        this.education = education;
        this.achievements = achievements;
        this.availability = availability;
        this.rating = rating;
    }
}
