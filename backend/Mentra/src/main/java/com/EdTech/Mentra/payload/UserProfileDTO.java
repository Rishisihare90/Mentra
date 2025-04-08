package com.EdTech.Mentra.payload;

import com.EdTech.Mentra.model.MenteeStatus;
import com.EdTech.Mentra.model.MentorStatus;
import com.EdTech.Mentra.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DecimalFormat;

@Data
@NoArgsConstructor
public class UserProfileDTO {
    private Long profileId;
    private User user;
    private String headline;
    private String about;
    private String experience;
    private String education;
    private String achievements;
    private String availability;
    private DecimalFormat rating;
    private MentorStatus mentor_status;
    private MenteeStatus menteeStatus;
}
