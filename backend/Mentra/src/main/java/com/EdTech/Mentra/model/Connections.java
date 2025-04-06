package com.EdTech.Mentra.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.print.attribute.standard.DateTimeAtCreation;

@Entity
@NoArgsConstructor
@Data
public class Connections {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long connection_id;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "peer_id", referencedColumnName = "user_id")
    private User peer;


    @ToString.Exclude
    @Enumerated(EnumType.STRING)
    private ConnectionStatus status;

    private DateTimeAtCreation createdAt;

    private DateTimeAtCompleted updatedAt;
}
