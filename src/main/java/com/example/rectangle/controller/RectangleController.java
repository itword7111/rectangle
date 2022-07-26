package com.example.rectangle.controller;

import com.example.rectangle.service.RectangleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RectangleController {
    private RectangleService rectangleService;
    @Autowired
    public RectangleController(RectangleService rectangleService) {
        this.rectangleService=rectangleService;
    }
    @RequestMapping(value = "/rectangles")
    public List rectangles() {
        return rectangleService.findAll();
    }
}
