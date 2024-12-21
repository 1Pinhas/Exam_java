package com.ism.service;

import java.util.List;

import com.ism.core.Database.ArticleCommandeRepoListInt;
import com.ism.entities.ArticleCommande;

public class ArticleCommandeService implements ArticleCommandeServiceInt {

    private ArticleCommandeRepoListInt artComRepo;

    public ArticleCommandeService(ArticleCommandeRepoListInt artComRepo) {
        this.artComRepo = artComRepo;
    }

    @Override
    public boolean saveList(ArticleCommande objet) {
        if (objet != null) {
            artComRepo.insert(objet);
            return true;
        }
        return false;
    }

    @Override
    public List<ArticleCommande> show() {
        return artComRepo.selectAll();
    }

    @Override
    public ArticleCommandeRepoListInt findData() {
        return artComRepo;
    }


} 

