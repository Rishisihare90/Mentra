package com.EdTech.Mentra.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user_skills")
public class UserSkills {

    @Id
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @Id
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "skills_id",referencedColumnName = "skills_id")
    private Skills skills;

    @ToString.Exclude
    @Enumerated(EnumType.STRING)
    private Level proficiency;

    private Boolean isMentor;
    private Boolean isMentee;

}
