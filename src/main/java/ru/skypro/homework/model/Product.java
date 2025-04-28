package ru.skypro.homework.model;

import org.apache.logging.log4j.util.Strings;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

   private String title;
   private int price;
   private Strings description;

    public Product(Strings description, int price, String title) {
        this.description = description;
        this.price = price;
        this.title = title;
    }

    public Product() {
    }

    public Strings getDescription() {
        return description;
    }

    public void setDescription(Strings description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
