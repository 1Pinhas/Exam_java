package com.ism.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString()
@EqualsAndHashCode(callSuper = false , of = {"nom"}) 
@Entity
@Table(name = "article")

public class Article {
  
private Long id;
@Column(length = 25,unique = true)
private String nom;
private Double prix;
private int qte;
private int qteCommande;

  
}
