package com.test.data.repository;


import com.test.data.entity.Job;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobRepository extends MongoRepository<Job, String> {
}
