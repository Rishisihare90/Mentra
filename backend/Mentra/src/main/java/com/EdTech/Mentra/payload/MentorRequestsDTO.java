package com.EdTech.Mentra.payload;

import com.EdTech.Mentra.model.MentorStatus;
import com.EdTech.Mentra.model.Skills;
import com.EdTech.Mentra.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.print.attribute.standard.DateTimeAtCreation;

@Data
@NoArgsConstructor
public class MentorRequestsDTO {
    private Long requestId;
    private User mentee;
    private User mentor;
    private Skills skills;
    private MentorStatus mentorStatus;
    private String message;
    private DateTimeAtCreation createdAt;
    private DateTimeAtCompleted updatedAt;
}
