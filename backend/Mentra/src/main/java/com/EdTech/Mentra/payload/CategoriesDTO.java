package com.EdTech.Mentra.payload;

import com.EdTech.Mentra.model.CategorySkills;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CategoriesDTO {
    private Long categoryId;
    private String name;
    private String description;
    private List<CategorySkills> categorySkills;
}
