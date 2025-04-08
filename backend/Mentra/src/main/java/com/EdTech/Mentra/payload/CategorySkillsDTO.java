package com.EdTech.Mentra.payload;

import com.EdTech.Mentra.model.Categories;
import com.EdTech.Mentra.model.Skills;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategorySkillsDTO {
    private Categories categories;
    private Skills skills;
}
