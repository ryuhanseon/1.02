package com.example.bbb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

    Article findBySubject(String subject);
    Article findBySubjectAndContent(String subject, String content);

}
