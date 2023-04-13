package com.example.group3demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("SecondService")
public class PropertyServiceSecondImpl implements PropertyService{
    @Value(value = "${my.test.property.invisible:demo-invisible}")
    private String demoString;

    @Override
    public String getPropertyValue() {
        return demoString;
    }
}
