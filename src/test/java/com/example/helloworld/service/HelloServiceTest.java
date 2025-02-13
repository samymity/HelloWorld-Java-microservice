package com.example.helloworld.service;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class HelloServiceTest {

    @InjectMocks
    private HelloService helloService;

    @Mock
    private GreetingRepository greetingRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSayHello() {
        String name = "World";
        String expectedGreeting = "Hello";

        when(greetingRepository.getGreeting()).thenReturn(expectedGreeting);

        String actualGreeting = helloService.sayHello(name);

        assertEquals("Hello, World!", actualGreeting, "The greeting should match the expected value.");
    }
}