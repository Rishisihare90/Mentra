package com.EdTech.Mentra.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.print.attribute.standard.DateTimeAtCompleted;

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

    private DateTimeAtCompleted sendAt;
    private DateTimeAtCompleted readAt;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "connection_id", referencedColumnName = "connection_id")
    private Connections connections;

}
