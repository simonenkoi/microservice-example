package edu.khai.microservice.newsservice.dao;

import edu.khai.microservice.newsservice.domain.News;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends CrudRepository<News, Long> {

}
