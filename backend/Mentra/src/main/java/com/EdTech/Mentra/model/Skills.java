package com.EdTech.Mentra.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

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
    @Column(name = "skills_id")
    private Long skillsId;

    @NotNull
    @Column(name = "name")
    @Size(max = 100)
    private String name;

    @Size(max = 50)
    private String category;

    @Column(columnDefinition = "TEXT")
    private String description;

    @ToString.Exclude
    @OneToMany(mappedBy = "skills",
            cascade = {CascadeType.ALL},orphanRemoval = true)
    private List<UserSkills> userSkills;
}
