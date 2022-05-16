package com.example.demo;

import lombok.Data;

@Data
public class Car {

    public static final String BRAND = "bmw";

    public String getBrand() {
        return BRAND;
    }
}
