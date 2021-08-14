package com.hdd.service.impl;

import com.hdd.repository.HelloWorldRepository;
import com.hdd.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService{

    @Autowired
    HelloWorldRepository helloWorldRepository;

    @Override
    public String get() {
        return helloWorldRepository.get();
    }
}
