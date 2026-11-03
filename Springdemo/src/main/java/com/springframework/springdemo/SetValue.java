package com.springframework.springdemo;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
@ConfigurationProperties("setvalue")
public class SetValue {

    private String name;
    private int age ;
    private String role;

}
