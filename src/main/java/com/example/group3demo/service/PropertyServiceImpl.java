package com.example.group3demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("FirstService")
public class PropertyServiceImpl implements PropertyService{

    @Value(value = "${my.test.property:demo-default}")
    private String demoString;

    @Override
    public String getPropertyValue() {
        return demoString;
    }
}
