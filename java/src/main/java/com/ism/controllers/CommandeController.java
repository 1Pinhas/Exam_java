package com.ism.controllers;

import com.ism.core.Database.CommandeRepoListInt;
import com.ism.entities.Client;
import com.ism.entities.Commande;
import com.ism.service.CommandeServiceInt;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CommandeController {
    

    private CommandeServiceInt commandeService;
    private CommandeRepoListInt commandeRepo;

    private ObservableList<Commande> commandesList = FXCollections.observableArrayList();

    public CommandeController(CommandeServiceInt commandeService, CommandeRepoListInt commandeRepo) {
        this.commandeService = commandeService;
        this.commandeRepo = commandeRepo;
    }

    public void creerCommande(Client client) {
        Commande newCom = new Commande();
        newCom.setClient(client);
        commandeService.saveList(newCom);
    }

    public Commande obtenirCommande(Long id) {
        return commandeService.finById(id);
    }

}
