package com.ism.controllers;


import com.ism.core.Database.ArticleCommandeRepoListInt;
import com.ism.entities.ArticleCommande;
import com.ism.service.ArticleCommandeServiceInt;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ArticleCommandeController {
    
    private ArticleCommandeServiceInt articleService;
    private ArticleCommandeRepoListInt artComRepo;

    private ObservableList<ArticleCommande> artCom = FXCollections.observableArrayList();


    public ArticleCommandeController(ArticleCommandeServiceInt articleService, ArticleCommandeRepoListInt artComRepo) {
        this.articleService = articleService;
        this.artComRepo = artComRepo;
    }

    
}
