package com.EdTech.Mentra.payload;

import com.EdTech.Mentra.model.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class UserDTO {
    private Long user_id;
    private String username;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String bio;
    private String profilePic;
    private String location;
    private String job_title;
    private String company;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime lastActive;
    private List<UserSkills> userSkills;
    private List<Connections> userConnections;
    private List<Connections> peerConnections;
    private List<Messages> sendMessages;
    private List<Messages> receivedMessages;
    private List<MentorRequests> menteeRequests;
    private List<MentorRequests> mentorRequests;
    private List<Sessions> menteeSessions;
    private List<Sessions> mentorSessions;
    private List<Reviews> reviews;
    private List<Reviews> reviewee;
    private List<Notifications> notifications;
}
