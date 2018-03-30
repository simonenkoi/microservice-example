package edu.khai.microservice.newsservice.controller;

import edu.khai.microservice.newsservice.dao.NewsRepository;
import edu.khai.microservice.newsservice.domain.News;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news")
public class NewsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(NewsController.class);
    private final NewsRepository newsRepository;

    public NewsController(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @GetMapping
    public Iterable<News> getAll() {
        LOGGER.info("Request to get all news");
        return newsRepository.findAll();
    }
}
