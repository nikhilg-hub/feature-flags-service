package com.fyproj.featureflagsservice.models;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiKey {

    private Long id;
    private String apiKey;
    private Long createdBy;
    private LocalDateTime createdOn;
    private LocalDateTime expiresOn;
    private Boolean isDeleted;

}