package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("HelloWorld Tests")
class HelloWorldTest {
    
    private HelloWorld helloWorld;
    
    @BeforeEach
    void setUp() {
        helloWorld = new HelloWorld();
    }
    
    @Test
    @DisplayName("Should return default greeting message")
    void shouldReturnDefaultGreeting() {
        // When
        String greeting = helloWorld.greet();
        
        // Then
        assertThat(greeting).isEqualTo("Hello, World!");
    }
    
    @Test
    @DisplayName("Should return custom greeting message")
    void shouldReturnCustomGreeting() {
        // Given
        HelloWorld customHelloWorld = new HelloWorld("Hello, Java 25!");
        
        // When
        String greeting = customHelloWorld.greet();
        
        // Then
        assertThat(greeting).isEqualTo("Hello, Java 25!");
    }
    
    @Test
    @DisplayName("Should set and get message using Lombok")
    void shouldSetAndGetMessage() {
        // Given
        String customMessage = "Custom Message";
        
        // When
        helloWorld.setMessage(customMessage);
        
        // Then
        assertThat(helloWorld.getMessage()).isEqualTo(customMessage);
    }
    
    @Test
    @DisplayName("Should have non-null message")
    void shouldHaveNonNullMessage() {
        // Then
        assertThat(helloWorld.getMessage()).isNotNull();
        assertThat(helloWorld.getMessage()).isNotEmpty();
    }
}

