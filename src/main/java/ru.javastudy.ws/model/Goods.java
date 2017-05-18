package ru.javastudy.ws.model;

import java.io.Serializable;

/**
 * Created by e.kutsenko on 17.05.2017.
 */
public class Goods implements Serializable {

  private int id;
  private String name;

  public Goods() {
  }

  public Goods(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Goods{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }
}

