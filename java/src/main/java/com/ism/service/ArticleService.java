package com.ism.service;

import java.util.List;

import com.ism.core.Database.ArticleRepoListInt;
import com.ism.entities.Article;


public class ArticleService implements ArticleServiceInt {


  private ArticleRepoListInt articleRepo;

  
  
  public ArticleService(ArticleRepoListInt articleRepo) {
    this.articleRepo = articleRepo;
  }

  @Override
  public boolean saveList(Article objet) {
    if(objet != null){
      articleRepo.insert(objet);
      return true;
    }
    return false;
  }

  @Override
  public List<Article> show() {
    return articleRepo.selectAll();
  }


  @Override
  public ArticleRepoListInt findData() {
    return articleRepo;
  }
  
}
