package com.mongo.springbootmongodb.repository;

import com.mongo.springbootmongodb.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users, Integer> {
}
