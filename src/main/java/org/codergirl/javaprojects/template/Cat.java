package org.codergirl.javaprojects.template;

public class Cat {

  private int id;
  private String name;

  public Cat(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Cat{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
