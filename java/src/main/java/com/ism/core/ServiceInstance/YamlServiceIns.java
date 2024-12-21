package com.ism.core.ServiceInstance;

import com.ism.core.Database.ArticleCommandeRepoListInt;
import com.ism.core.Database.ArticleRepoListInt;
import com.ism.core.Database.ClientRepoListInt;
import com.ism.entities.Commande;

public interface  YamlServiceIns {
  Object getInstanceClient(String repoType, String repoType2,ClientRepoListInt clientRepo);
  Object getInstanceArticle(String repoType, String repoType2,ArticleRepoListInt articleRepo);
  Object getInstanceArticleCommande(String repoType, String repoType2,ArticleCommandeRepoListInt artComRepo);
  Object getInstanceCommande(String repoType, String repoType2,Commande comRepo);
}