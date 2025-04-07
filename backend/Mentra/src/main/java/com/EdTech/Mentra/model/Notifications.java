package com.EdTech.Mentra.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.print.attribute.standard.DateTimeAtCreation;

@Entity
@Data
@NoArgsConstructor
public class Notifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notification_id;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @Size(max = 50)
    @NotNull
    private String type;

    @Column(columnDefinition = "TEXT")
    @NotNull
    private String content;

    private DateTimeAtCreation createdAt;

    private DateTimeAtCompleted readAt;

    @Size(max = 255)
    private String link;
}
