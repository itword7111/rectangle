package com.example.rectangle.service;

import com.example.rectangle.repository.RectangleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RectangleServiceImpl implements RectangleService {
    private final RectangleRepository rectangleRepository;

    public RectangleServiceImpl(RectangleRepository rectangleRepository) {
        this.rectangleRepository = rectangleRepository;
    }

    @Override
    public List findAll(){
        return rectangleRepository.findAll();
    }
}
