package webshop.webshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import webshop.webshop.model.Food;


@Repository
public interface FoodRepository extends CrudRepository<Food, Long> {




}
