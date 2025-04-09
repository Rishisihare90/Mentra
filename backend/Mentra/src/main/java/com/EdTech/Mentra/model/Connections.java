package com.EdTech.Mentra.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

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

    @ToString.Exclude
    @OneToMany(mappedBy = "connections",
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Messages> messages;


}
