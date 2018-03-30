package edu.khai.microservice.businessservice.service;

import edu.khai.microservice.businessservice.domain.News;
import java.util.Collections;
import org.springframework.stereotype.Component;

@Component
public class NewsServiceFallback implements NewsServiceClient {

    @Override
    public Iterable<News> getAll() {
        return Collections.singletonList(new News("-", "-"));
    }
}
