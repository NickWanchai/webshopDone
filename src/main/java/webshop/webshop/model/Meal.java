package webshop.webshop.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
    private String food;
    private String weight;

    public Meal(String food) {
        this.food = food;
    }

    public Meal(Long id, String name, String food, List<Food> foods) {
        this.id = id;
        Name = name;
        this.food = food;
        this.foods = foods;
    }

    public Meal() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    @OneToMany(mappedBy = "meal")
    List<Food> foods;




}
