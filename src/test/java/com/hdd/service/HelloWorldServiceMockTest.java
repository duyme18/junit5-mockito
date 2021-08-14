package com.hdd.service;

import com.hdd.repository.HelloWorldRepository;
import com.hdd.service.impl.HelloWorldServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

//@ExtendWith(MockitoExtension.class) , need this? still able to run.
@SpringBootTest
public class HelloWorldServiceMockTest {

    @Mock
    private HelloWorldRepository helloWorldRepository;

    //@Spy
    @InjectMocks // auto inject helloWorldRepository
    private HelloWorldService helloWorldService = new HelloWorldServiceImpl();

    @BeforeEach
    void setMockOutput() {
        //when(helloService.get()).thenReturn("Hello Mockito");
        when(helloWorldRepository.get()).thenReturn("Hello Mockito From Repository");
    }

    @DisplayName("Test Mock helloWorldService + helloWorldRepository")
    @Test
    void testGet() {
        assertEquals("Hello Mockito From Repository", helloWorldService.get());
    }

}
