package com.EdTech.Mentra.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.print.attribute.standard.DateTimeAtCreation;

@Entity
@Data
@NoArgsConstructor
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "reviewer_id", referencedColumnName = "user_id")
    private User reviewer;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "reviewee_id", referencedColumnName = "user_id")
    private User reviewee;

    @NotNull
    private Integer rating;

    @Column(columnDefinition = "TEXT")
    private String content;

    private DateTimeAtCreation createdAt;
}
