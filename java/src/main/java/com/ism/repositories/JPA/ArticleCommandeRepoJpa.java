package com.ism.repositories.JPA;

import com.ism.core.Database.ArticleCommandeRepoListInt;
import com.ism.entities.ArticleCommande;
import com.ism.repositories.Impl.RepositoryJpaImpl;

public class ArticleCommandeRepoJpa extends RepositoryJpaImpl<ArticleCommande> implements ArticleCommandeRepoListInt {

    public ArticleCommandeRepoJpa() {
        super(ArticleCommande.class);
        table = "ArticleCommande";
    }
}
