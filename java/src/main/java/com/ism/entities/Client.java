package com.ism.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@EqualsAndHashCode(callSuper = false) 
@Entity
@Table(name = "client")
@NamedQueries({
  @NamedQuery(name ="SelectByPhone", query = "SELECT e FROM Client e WHERE e.tel = :telephone"),
  @NamedQuery(name ="SelectBySurname", query = "SELECT e FROM Client e WHERE e.name = :nom")
})
@ToString()
public class Client {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nom;
  private String prenom;
  private String ville;
  private String quartier;
  private String numeroVilla;
  private String telephone;

  @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Commande> commandes = new ArrayList<>();




}
