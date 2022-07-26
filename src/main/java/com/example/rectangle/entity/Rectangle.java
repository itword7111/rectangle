package com.example.rectangle.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Rectangle{
    @Id
    private String id;
    private Double firstSide;
    private Double secondSide;
    private String color;

    public Rectangle(Double firstSide, Double secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.color = color;
    }
    public Rectangle(){}

    public Double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(Double firstSide) {
        this.firstSide = firstSide;
    }

    public Double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(Double secondSide) {
        this.secondSide = secondSide;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
