package com.ism.service;

import java.util.List;

import com.ism.core.Database.CommandeRepoListInt;
import com.ism.entities.Commande;

public class CommandeService implements CommandeServiceInt {
    
    private CommandeRepoListInt commandeRepo;

    public CommandeService(CommandeRepoListInt commandeRepo) {
        this.commandeRepo = commandeRepo;
    }

    @Override
    public boolean saveList(Commande objet) {
        if (objet != null) {
            commandeRepo.insert(objet);
            return true; 
        }
        return false;
    }

    @Override
    public List<Commande> show() {
        return commandeRepo.selectAll();
    }

    @Override
    public CommandeRepoListInt findData() {
        return commandeRepo;
    }
    
}
