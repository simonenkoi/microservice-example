package edu.khai.microservice.businessservice.service;

import edu.khai.microservice.businessservice.domain.News;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "NEWS-SERVICE", fallback = NewsServiceFallback.class)
public interface NewsServiceClient {

    @GetMapping("/news")
    Iterable<News> getAll();
}
