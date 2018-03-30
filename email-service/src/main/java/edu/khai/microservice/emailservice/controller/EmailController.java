package edu.khai.microservice.emailservice.controller;

import edu.khai.microservice.emailservice.dao.EmailRepository;
import edu.khai.microservice.emailservice.domain.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emails")
public class EmailController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmailController.class);
    private final EmailRepository emailRepository;

    public EmailController(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    @GetMapping
    public Iterable<Email> getAll() {
        LOGGER.info("Request to get all emails");
        return emailRepository.findAll();
    }
}
