package edu.khai.microservice.businessservice.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class News {

    private long id;
    private String title;
    private String description;

    public News(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
