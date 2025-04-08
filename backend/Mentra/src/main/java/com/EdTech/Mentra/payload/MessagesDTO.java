package com.EdTech.Mentra.payload;

import com.EdTech.Mentra.model.Connections;
import com.EdTech.Mentra.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.attribute.standard.DateTimeAtCompleted;

@Data
@NoArgsConstructor
public class MessagesDTO {
    private Long message_id;
    private User sender;
    private User receiver;
    private String content;
    private DateTimeAtCompleted sendAt;
    private DateTimeAtCompleted readAt;
    private Connections connections;
}
