package webshop.webshop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webshop.webshop.model.Food;
import webshop.webshop.repository.FoodRepository;


    @Service
    public class FoodService implements FoodRepository{

        @Autowired
        FoodRepository foodRepository;

        //getting all Food
        public List<Food> getAllFood()
        {
            List<Food> foodList = new ArrayList<Food>();

            foodRepository.findAll().forEach(food -> foodList.add(food));
            return foodList;
        }


        //getting a specific food
        public Food getFoodById(long id)
        {
            return foodRepository.findById(id).get();
        }


        public void saveOrUpdate(Food food)
        {
            foodRepository.save(food);
        }

        //deleting a specific record
        public void delete(long id)
        {
            foodRepository.deleteById(id);
        }


        @Override
        public <S extends Food> S save(S s) {
            return null;
        }

        @Override
        public <S extends Food> Iterable<S> saveAll(Iterable<S> iterable) {
            return null;
        }

        @Override
        public Optional<Food> findById(Long aLong) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(Long aLong) {
            return false;
        }

        @Override
        public Iterable<Food> findAll() {
            return null;
        }

        @Override
        public Iterable<Food> findAllById(Iterable<Long> iterable) {
            return null;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(Long aLong) {

        }

        @Override
        public void delete(Food food) {

        }

        @Override
        public void deleteAll(Iterable<? extends Food> iterable) {

        }

        @Override
        public void deleteAll() {

        }
    }

