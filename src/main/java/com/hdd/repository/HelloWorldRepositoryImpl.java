package com.hdd.repository;

import com.hdd.repository.HelloWorldRepository;
import org.springframework.stereotype.Repository;

@Repository
public class HelloWorldRepositoryImpl implements HelloWorldRepository {
    @Override
    public String get() {
        return "Hello JUnit 5";
    }
}
