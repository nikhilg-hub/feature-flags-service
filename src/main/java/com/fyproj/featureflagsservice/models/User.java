package com.fyproj.featureflagsservice.models;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private Long userid;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private LocalDateTime createdOn;

}
