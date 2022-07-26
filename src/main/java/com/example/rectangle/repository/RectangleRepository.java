package com.example.rectangle.repository;

import com.example.rectangle.entity.Rectangle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RectangleRepository extends MongoRepository<Rectangle,Integer> {

}
