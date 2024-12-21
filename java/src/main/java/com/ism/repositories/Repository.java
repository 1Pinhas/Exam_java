package com.ism.repositories;

import java.util.List;


public interface Repository <A>{
  int insert(A data);
  List<A> selectAll();
  void remove(int id);
  A selectById(int id);
  void update(A objet);
}
