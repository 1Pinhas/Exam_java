package com.ism.repositories.JPA;

import com.ism.core.Database.CommandeRepoListInt;
import com.ism.entities.Commande;
import com.ism.repositories.Impl.RepositoryJpaImpl;

public class CommandeRepoJpa extends RepositoryJpaImpl<Commande> implements CommandeRepoListInt {
 
    public CommandeRepoJpa() {
        super(Commande.class);
        table = "Commande";
    }
    
}
