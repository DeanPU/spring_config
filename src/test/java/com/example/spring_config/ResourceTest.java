package com.example.spring_config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

public class ResourceTest {
    @Test
    void testResource() throws IOException {
        var resource = new ClassPathResource("/application.properties");

        Assertions.assertNotNull(resource);

        System.out.println(resource.getPath());
        System.out.println(resource.getFilename());
        System.out.println(resource.getURL());
        System.out.println(resource.getFile().getAbsolutePath());
    }
}
