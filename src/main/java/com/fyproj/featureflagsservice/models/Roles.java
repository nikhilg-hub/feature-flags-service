package com.fyproj.featureflagsservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Roles {

    private Long roleid;
    private String roleName;
    private String description;
    private Boolean isDeleted;
}
