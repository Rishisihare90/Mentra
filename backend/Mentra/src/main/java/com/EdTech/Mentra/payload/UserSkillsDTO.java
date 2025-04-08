package com.EdTech.Mentra.payload;

import com.EdTech.Mentra.model.Level;
import com.EdTech.Mentra.model.Skills;
import com.EdTech.Mentra.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserSkillsDTO {
    private User user;
    private Skills skills;
    private Level proficiency;
    private Boolean isMentor;
    private Boolean isMentee;
}
