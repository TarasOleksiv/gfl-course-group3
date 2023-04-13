package com.example.group3demo.controller;

import com.example.group3demo.service.PropertyService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PropertyController {

    private final PropertyService propertyService;
    private final PropertyService propertySecondService;

    public PropertyController(@Qualifier("FirstService") PropertyService propertyService,
                              @Qualifier("SecondService") PropertyService propertySecondService) {
        this.propertyService = propertyService;
        this.propertySecondService = propertySecondService;
    }

    @GetMapping("api/property")
    public ResponseEntity<String> getResponse() {
        return ResponseEntity.ok(propertyService.getPropertyValue());
    }

    @GetMapping("api/property2")
    public ResponseEntity<String> getResponse2() {
        return ResponseEntity.ok(propertySecondService.getPropertyValue());
    }
}
