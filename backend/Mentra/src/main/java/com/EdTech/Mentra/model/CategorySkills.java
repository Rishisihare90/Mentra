package com.EdTech.Mentra.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
public class CategorySkills {
    @Id
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Categories categories;

    @Id
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "skills_id", referencedColumnName = "skills_id")
    private Skills skills;


}
