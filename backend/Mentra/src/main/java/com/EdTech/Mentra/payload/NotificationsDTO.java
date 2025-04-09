package com.EdTech.Mentra.payload;

import com.EdTech.Mentra.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
public class NotificationsDTO {
    private Long notification_id;
    private User user;
    private String type;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime readAt;
    private String link;
}
