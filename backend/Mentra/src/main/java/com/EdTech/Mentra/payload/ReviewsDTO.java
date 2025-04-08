package com.EdTech.Mentra.payload;

import com.EdTech.Mentra.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.attribute.standard.DateTimeAtCreation;

@Data
@NoArgsConstructor
public class ReviewsDTO {
    private Long reviewId;
    private User reviewer;
    private User reviewee;
    private Integer rating;
    private String content;
    private DateTimeAtCreation createdAt;
}
