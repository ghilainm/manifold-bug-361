package com.example.demo;

public class DemoApplication {

    public static void main(String[] args) {
        Vehicle car = (Vehicle) new Car();
        System.out.println(car.getBrand());
    }

}
