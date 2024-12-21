package com.ism.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.ism.App;
import com.ism.core.Database.ArticleRepoListInt;
import com.ism.entities.Article;
import com.ism.entities.Client;
import com.ism.repositories.JPA.ArticleRepoJpa;
import com.ism.service.ArticleService;
import com.ism.service.ArticleServiceInt;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


public class ArticleController {
  
    @FXML
    private TableView<Article> tableView;
    @FXML
    private TableColumn<Article, String> nomColumn;
    @FXML
    private TableColumn<Article, Double> prixColumn;
     @FXML
    private TableColumn<Client, Double> qteColumn;
    @FXML
    private TableColumn<Client, Double> qteCommandeColumn;

    @FXML
    private TextField searchField;

    private ArticleRepoListInt articleRepo;
    private ArticleServiceInt  articleService;
    // private final ArticleService articleService = new ArticleService();
    public static Article selectedArticle;


    public ArticleController() {
      articleRepo = new ArticleRepoJpa();
      articleService = new ArticleService(articleRepo);
    }

  private void handleRefuserButtonAction(Article article) throws IOException {
    selectedArticle = article;
    App.setRoot("updateArticle");
  }


  @FXML
  private void create() throws IOException {
      App.setRoot("CreateArticle");
  }
















}
