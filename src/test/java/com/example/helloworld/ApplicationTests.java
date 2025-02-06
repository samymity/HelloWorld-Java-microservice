package com.example.helloworld;

import com.example.helloworld.test.ChildLego;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ApplicationTests {

    @Autowired
    private ChildLego childlego;

    @Test
    public void contextLoads() {
        assertNotNull(childlego); // Ensure the ChildLego bean is not null
    }
}