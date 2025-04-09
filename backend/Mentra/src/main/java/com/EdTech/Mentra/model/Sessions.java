package com.EdTech.Mentra.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;


@Entity
@NoArgsConstructor
@Data
public class Sessions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sessionId;


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
    @JoinColumn(name = "skills_id", referencedColumnName = "skills_id")
    private Skills skills;

    private LocalDateTime scheduledAt;
    private Integer duration;

    @Enumerated(EnumType.STRING)
    private SessionStatus status;

    @Column(columnDefinition = "TEXT")
    private String notes;

    @Column(columnDefinition = "TEXT")
    private String feedback;

    @PrePersist
    public void onCreate(){
        this.scheduledAt = LocalDateTime.now();
    }

}
