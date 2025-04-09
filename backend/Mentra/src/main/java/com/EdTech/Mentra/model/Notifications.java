package com.EdTech.Mentra.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;


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

    private LocalDateTime createdAt;

    private LocalDateTime readAt;

    @PrePersist
    public void onCreate(){
        this.createdAt = LocalDateTime.now();
        this.readAt = LocalDateTime.now();
    }

    @PreUpdate
    public void onUpdate(){
        this.readAt = LocalDateTime.now();
    }

    @Size(max = 255)
    private String link;
}
