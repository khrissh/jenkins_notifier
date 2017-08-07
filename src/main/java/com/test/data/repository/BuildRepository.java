package com.test.data.repository;


import com.test.data.entity.Build;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BuildRepository extends MongoRepository<Build, String> {
}
