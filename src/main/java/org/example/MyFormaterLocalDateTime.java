package org.example;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MyFormaterLocalDateTime {

    @JsonFormat(
            pattern = "yyyy:MM:dd'##':HH:mm:ss:SSS",
            shape = JsonFormat.Shape.STRING,
            locale = "ru",
            timezone = "Europe/Moscow"
    )
    private LocalDateTime time;
}