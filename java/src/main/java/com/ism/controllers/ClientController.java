package com.ism.controllers;

import java.io.IOException;

import com.ism.App;
import com.ism.core.Database.ClientRepoListInt;
import com.ism.entities.Client;
import com.ism.repositories.JPA.ClientRepoJpa;
import com.ism.service.ClientService;
import com.ism.service.ClientServiceInt;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientController {

    @FXML
    private TableColumn<Client, String> nomColumn;
    @FXML
    private TableColumn<Client, String> prenomColumn;
    @FXML
    private TableColumn<Client, String> telColumn;
    @FXML
    private TableColumn<Client, String> adresseColumn;
    @FXML
    private TableColumn<Client, Void> actionsColumn;  // Utilisation de Void pour l'absence de données

    private ClientServiceInt clientService;
    private ClientRepoListInt clientRepo;
    public static Client selectedClient;

    // Liste observable pour stocker les clients
    private ObservableList<Client> clientList = FXCollections.observableArrayList();


    public ClientController() {
        clientRepo = new ClientRepoJpa();
        clientService = new ClientService(clientRepo);
    }
    

    @FXML
    private void create() throws IOException {
        App.setRoot("createClient");
    }

    public Client searchClient(String telephone) {
        return clientService.searchClient(telephone);
    }





   
}
