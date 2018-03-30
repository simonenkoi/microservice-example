package edu.khai.microservice.businessservice.controller;

import edu.khai.microservice.businessservice.domain.Email;
import edu.khai.microservice.businessservice.domain.News;
import edu.khai.microservice.businessservice.service.EmailServiceClient;
import edu.khai.microservice.businessservice.service.NewsServiceClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    private final EmailServiceClient emailServiceClient;
    private final NewsServiceClient newsServiceClient;

    public RootController(EmailServiceClient emailServiceClient,
        NewsServiceClient newsServiceClient) {
        this.emailServiceClient = emailServiceClient;
        this.newsServiceClient = newsServiceClient;
    }

    @GetMapping("/emails")
    public Iterable<Email> getAllEmails() {
        return emailServiceClient.getAll();
    }

    @GetMapping("/news")
    public Iterable<News> getAllNews() {
        return newsServiceClient.getAll();
    }
}
