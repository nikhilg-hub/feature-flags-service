package com.fyproj.featureflagsservice.models;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FeatureFlag {

    private int flagId;
    private String key;
    private String name;

    private String description;
    private boolean enabled;
    private String createdBy;
    private Date createdOn;

}