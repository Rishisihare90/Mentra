package com.EdTech.Mentra.payload;

import com.EdTech.Mentra.model.SessionStatus;
import com.EdTech.Mentra.model.Skills;
import com.EdTech.Mentra.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
public class SessionsDTO {
    private Long sessionId;
    private User mentee;
    private User mentor;
    private Skills skills;
    private LocalDateTime scheduledAt;
    private Integer duration;
    private SessionStatus status;
    private String notes;
    private String feedback;
}
