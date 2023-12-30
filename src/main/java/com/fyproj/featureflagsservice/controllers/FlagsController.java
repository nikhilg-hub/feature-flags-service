package com.fyproj.featureflagsservice.controllers;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fyproj.featureflagsservice.models.FeatureFlag;




@RestController
@RequestMapping("/flags")
public class FlagsController {

    @GetMapping(produces = "application/json", path = "/{key}")
    public FeatureFlag getFlagByKey(@PathVariable String key) {
        FeatureFlag ff =  new FeatureFlag();
        ff.setKey(key);
        ff.setName("Sample Flag");
        ff.setCreatedOn(new Date());
        ff.setCreatedBy("nikhilg");
        return ff;
    }

    // TODO: Create POST, PUT, DELETE controllers for

}
