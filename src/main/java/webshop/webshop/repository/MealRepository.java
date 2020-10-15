package webshop.webshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import webshop.webshop.model.Meal;


@Repository
public interface MealRepository extends CrudRepository<Meal, Long> {



}
