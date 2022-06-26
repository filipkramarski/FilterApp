package com.example.filterapp.models;


import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Review {

    private Long id;
    private String reviewId;
    private String reviewFullText;
    private String reviewText;
    private Integer numLikes;
    private Integer numComments;
    private Integer numShares;
    private Integer rating;
    private String reviewCreatedOn;
    private String reviewCreatedOnDate;
    private Long reviewCreatedOnTime;
    private Long reviewerId;
    private Long reviewerUrl;
    private String reviewerName;
    private String reviewerEmail;
    private String sourceType;
    private boolean isVerified;
    private String source;
    private String sourceName;
    private String sourceId;

    public Review(Long id, String reviewId, String reviewFullText, String reviewText,
                  Integer numLikes, Integer numComments, Integer numShares, Integer rating,
                  String reviewCreatedOn, String reviewCreatedOnDate, Long reviewCreatedOnTime,
                  Long reviewerId, Long reviewerUrl, String reviewerName, String reviewerEmail,
                  String sourceType, boolean isVerified, String source, String sourceName, String sourceId) {
        this.id = id;
        this.reviewId = reviewId;
        this.reviewFullText = reviewFullText;
        this.reviewText = reviewText;
        this.numLikes = numLikes;
        this.numComments = numComments;
        this.numShares = numShares;
        this.rating = rating;
        this.reviewCreatedOn = reviewCreatedOn;
        this.reviewCreatedOnDate = reviewCreatedOnDate;
        this.reviewCreatedOnTime = reviewCreatedOnTime;
        this.reviewerId = reviewerId;
        this.reviewerUrl = reviewerUrl;
        this.reviewerName = reviewerName;
        this.reviewerEmail = reviewerEmail;
        this.sourceType = sourceType;
        this.isVerified = isVerified;
        this.source = source;
        this.sourceName = sourceName;
        this.sourceId = sourceId;
    }
}
