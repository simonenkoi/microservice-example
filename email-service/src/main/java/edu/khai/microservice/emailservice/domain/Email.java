package edu.khai.microservice.emailservice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Email {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @org.hibernate.validator.constraints.Email
    @Column(name = "from_user")
    private String from;

    @NotNull
    @org.hibernate.validator.constraints.Email
    @Column(name = "to_user")
    private String to;

    @NotNull
    private String title;

    @NotNull
    private String description;
}
