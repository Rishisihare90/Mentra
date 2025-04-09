package com.EdTech.Mentra.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class MentorRequests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "mentee_id", referencedColumnName = "user_id")
    private User mentee;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "mentor_id", referencedColumnName = "user_id")
    private User mentor;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "skills", referencedColumnName = "skills_id")
    private Skills skills;


    @ToString.Exclude
    @Enumerated(EnumType.STRING)
    private MentorStatus mentorStatus;

    @Column(columnDefinition = "TEXT")
    private String message;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @PrePersist
    public void onCreate(){
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    public void onUpdate(){
        this.updatedAt = LocalDateTime.now();
    }
}
