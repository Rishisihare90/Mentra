package com.EdTech.Mentra.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;


@Entity
@Data
@NoArgsConstructor
public class Messages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long message_id;


    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "sender_id", referencedColumnName = "user_id")
    private User sender;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "receiver_id", referencedColumnName = "user_id")
    private User receiver;


    @NotNull
    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime sendAt;
    private LocalDateTime readAt;

    @PrePersist
    public void onCreate(){
        this.sendAt = LocalDateTime.now();
        this.readAt = LocalDateTime.now();
    }

    @PreUpdate
    public void onRead(){
        this.readAt = LocalDateTime.now();
    }

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "connection_id", referencedColumnName = "connection_id")
    private Connections connections;

}
