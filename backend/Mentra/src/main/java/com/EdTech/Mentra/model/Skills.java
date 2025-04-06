package com.EdTech.Mentra.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Skills",
        uniqueConstraints = {
        @UniqueConstraint(columnNames = "name")
        })
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Skills_id")
    private Long skillsId;

    @NotNull
    @Column(name = "name")
    @Size(max = 100)
    private String name;

    @Size(max = 50)
    private String category;

    @Column(columnDefinition = "TEXT")
    private String description;

    public Skills(String name, String category, String description) {
        this.name = name;
        this.category = category;
        this.description = description;
    }
}
