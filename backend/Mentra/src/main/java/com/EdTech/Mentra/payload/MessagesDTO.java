package com.EdTech.Mentra.payload;

import com.EdTech.Mentra.model.Connections;
import com.EdTech.Mentra.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
public class MessagesDTO {
    private Long message_id;
    private User sender;
    private User receiver;
    private String content;
    private LocalDateTime sendAt;
    private LocalDateTime readAt;
    private Connections connections;
}
