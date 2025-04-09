package com.EdTech.Mentra.payload;

import com.EdTech.Mentra.model.ConnectionStatus;
import com.EdTech.Mentra.model.Messages;
import com.EdTech.Mentra.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class ConnectionsDTO {
    private Long connection_id;
    private User user;
    private User peer;
    private ConnectionStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<Messages> messages;
}
