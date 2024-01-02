package com.example.bbb;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;
import com.example.bbb.DataNotFoundException;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public List<Article> getList(){
      return   this.articleRepository.findAll();
    }

    public Article getarticle(Integer id){
        Optional<Article> article = this.articleRepository.findById(id);
        if (article.isPresent()){
            return article.get();
        }
        else {
            throw new DataNotFoundException("article not found");
        }

    }


}
