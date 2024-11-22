package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper()
                .registerModule(new JavaTimeModule());
        MyFormaterLocalDateTime myTime = new MyFormaterLocalDateTime(LocalDateTime.now());
        String json = mapper.writeValueAsString(myTime);
        System.out.println(json);
    }
}
