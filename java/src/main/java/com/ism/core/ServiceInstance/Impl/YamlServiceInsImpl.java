package com.ism.core.ServiceInstance.Impl;


import com.ism.core.Database.ArticleCommandeRepoListInt;
import com.ism.core.Database.ArticleRepoListInt;
import com.ism.core.Database.ClientRepoListInt;
import com.ism.core.Database.Database;
import com.ism.core.ServiceInstance.YamlServiceIns;
import com.ism.entities.Commande;

public class YamlServiceInsImpl implements YamlServiceIns{

  @Override
  public Object getInstanceClient(String repoType, String repoType2, ClientRepoListInt clientRepo) {
    try {
      String className = Database.getActiveDatabase(repoType, repoType2);
      if (className != null) {
          Class<?> clazz = Class.forName(className);
          return clazz.getDeclaredConstructor(ClientRepoListInt.class).newInstance(clientRepo);
      }
      } catch (Exception e) {
          e.printStackTrace();
      }
      return null;
  }

  @Override
  public Object getInstanceArticle(String repoType, String repoType2, ArticleRepoListInt articleRepo) {
    try {
      String className = Database.getActiveDatabase(repoType, repoType2);
      if (className != null) {
          Class<?> clazz = Class.forName(className);
          return clazz.getDeclaredConstructor(ArticleRepoListInt.class).newInstance(articleRepo);
      }
      } catch (Exception e) {
          e.printStackTrace();
      }
      return null;
  }

@Override
public Object getInstanceArticleCommande(String repoType, String repoType2, ArticleCommandeRepoListInt artComRepo) {
      try {
        String className = Database.getActiveDatabase(repoType, repoType2);
        if (className!= null) {
            Class<?> clazz = Class.forName(className);
            return clazz.getDeclaredConstructor(ArticleCommandeRepoListInt.class).newInstance(artComRepo);
        }
      } catch (Exception e) {
          e.printStackTrace();
      }
      return null;
  
}

@Override
public Object getInstanceCommande(String repoType, String repoType2, Commande comRepo) {
      try {
        String className = Database.getActiveDatabase(repoType, repoType2);
        if (className!= null) {
            Class<?> clazz = Class.forName(className);
            return clazz.getDeclaredConstructor(Commande.class).newInstance(comRepo);
        }
      } catch (Exception e) {
          e.printStackTrace();
      }
      return null;
}
  
}
