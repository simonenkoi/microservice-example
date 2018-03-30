package edu.khai.microservice.emailservice.dao;

import edu.khai.microservice.emailservice.domain.Email;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends CrudRepository<Email, Long> {

}
