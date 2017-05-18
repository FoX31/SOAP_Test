package ru.javastudy.ws.model;

import java.util.List;

/**
 * Created by e.kutsenko on 17.05.2017.
 */
public class Document {
  private int id;
  private String name;
  private List<Goods> goodsList;

  public Document() {
  }

  public Document(int id, String name, List<Goods> goodsList) {
    this.id = id;
    this.name = name;
    this.goodsList = goodsList;
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

  public List<Goods> getGoodsList() {
    return goodsList;
  }

  public void setGoodsList(List<Goods> goodsList) {
    this.goodsList = goodsList;
  }
}
