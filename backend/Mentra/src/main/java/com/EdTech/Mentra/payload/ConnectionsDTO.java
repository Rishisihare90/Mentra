package com.EdTech.Mentra.payload;

import com.EdTech.Mentra.model.ConnectionStatus;
import com.EdTech.Mentra.model.Messages;
import com.EdTech.Mentra.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.print.attribute.standard.DateTimeAtCreation;
import java.util.List;

@Data
@NoArgsConstructor
public class ConnectionsDTO {
    private Long connection_id;
    private User user;
    private User peer;
    private ConnectionStatus status;
    private DateTimeAtCreation createdAt;
    private DateTimeAtCompleted updatedAt;
    private List<Messages> messages;
}
