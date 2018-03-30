package edu.khai.microservice.businessservice.service;

import edu.khai.microservice.businessservice.domain.Email;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "EMAIL-SERVICE", fallback = EmailServiceFallback.class)
public interface EmailServiceClient {

    @GetMapping("/emails")
    Iterable<Email> getAll();
}