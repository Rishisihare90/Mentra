package com.EdTech.Mentra.payload;

import com.EdTech.Mentra.model.MentorStatus;
import com.EdTech.Mentra.model.Skills;
import com.EdTech.Mentra.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
public class MentorRequestsDTO {
    private Long requestId;
    private User mentee;
    private User mentor;
    private Skills skills;
    private MentorStatus mentorStatus;
    private String message;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
