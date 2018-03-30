package edu.khai.microservice.businessservice.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Email {

    private long id;
    private String from;
    private String to;
    private String title;
    private String description;

    public Email(String from, String to, String title, String description) {
        this.from = from;
        this.to = to;
        this.title = title;
        this.description = description;
    }
}
