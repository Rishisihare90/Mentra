package com.EdTech.Mentra.payload;

import com.EdTech.Mentra.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
public class ReviewsDTO {
    private Long reviewId;
    private User reviewer;
    private User reviewee;
    private Integer rating;
    private String content;
    private LocalDateTime createdAt;
}
