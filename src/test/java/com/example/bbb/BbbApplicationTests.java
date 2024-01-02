package com.example.bbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class BbbApplicationTests {

	@Autowired
	private ArticleRepository articleRepository;

	@Transactional
	@Test
	void contextLoads() {

		assertEquals(2, this.articleRepository.count());
		Optional<Article> oq = this.articleRepository.findById(1);
		assertTrue(oq.isPresent());
		Article q = oq.get();
		this.articleRepository.delete(q);
		assertEquals(1, this.articleRepository.count());

		}
	}


