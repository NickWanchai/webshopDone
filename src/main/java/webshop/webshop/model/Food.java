package webshop.webshop.model;


import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Food{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int price;

    @ManyToOne
    Meal meal;


    public Food(){}

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Food(long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
