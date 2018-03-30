package edu.khai.microservice.businessservice.service;

import edu.khai.microservice.businessservice.domain.Email;
import java.util.Collections;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceFallback implements EmailServiceClient {

    @Override
    public Iterable<Email> getAll() {
        return Collections.singletonList(new Email("-", "-", "-", "-"));
    }
}
