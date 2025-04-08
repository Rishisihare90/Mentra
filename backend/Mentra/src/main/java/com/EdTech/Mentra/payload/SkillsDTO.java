package com.EdTech.Mentra.payload;

import com.EdTech.Mentra.model.CategorySkills;
import com.EdTech.Mentra.model.MentorRequests;
import com.EdTech.Mentra.model.Sessions;
import com.EdTech.Mentra.model.UserSkills;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SkillsDTO {
    private Long skillsId;
    private String name;
    private String category;
    private String description;
    private List<UserSkills> userSkills;
    private List<CategorySkills> categorySkills;
    private List<MentorRequests> mentorRequests;
    private List<Sessions> skillSession;
}
