package com.EdTech.Mentra.payload;

import com.EdTech.Mentra.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.print.attribute.standard.DateTimeAtCreation;

@Data
@NoArgsConstructor
public class NotificationsDTO {
    private Long notification_id;
    private User user;
    private String type;
    private String content;
    private DateTimeAtCreation createdAt;
    private DateTimeAtCompleted readAt;
    private String link;
}
