package com.ism.repositories.JPA;

import com.ism.core.Database.ArticleRepoListInt;
import com.ism.repositories.Impl.RepositoryJpaImpl;
import com.ism.entities.Article;

public class ArticleRepoJpa extends RepositoryJpaImpl<Article> implements ArticleRepoListInt {

  public ArticleRepoJpa() {
    super(Article.class);
    table = "Article";
  }

  @Override
  public Article selectByName(String nameArticle) {
      datas = selectAll();
    return datas.stream()
    .filter(article -> article.getNom().compareTo(nameArticle) == 0)
    .findFirst()
    .orElse(null);
  }
  
}
