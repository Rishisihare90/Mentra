package com.EdTech.Mentra.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.attribute.standard.DateTimeAtCreation;

@Entity
@NoArgsConstructor
@Data
public class Sessions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sessionId;

    @ManyToOne
    @JoinColumn(name = "mentee_id", referencedColumnName = "user_id")
    private User mentee;

    @ManyToOne
    @JoinColumn(name = "mentor_id", referencedColumnName = "user_id")
    private User mentor;

    @ManyToOne
    @JoinColumn(name = "skills_id", referencedColumnName = "skills_id")
    private Skills skills;

    private DateTimeAtCreation scheduledAt;
    private Integer duration;

    @Enumerated(EnumType.STRING)
    private SessionStatus status;

    @Column(columnDefinition = "TEXT")
    private String notes;

    @Column(columnDefinition = "TEXT")
    private String feedback;
}
