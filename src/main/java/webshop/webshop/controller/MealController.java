package webshop.webshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import webshop.webshop.model.Meal;
import webshop.webshop.repository.FoodRepository;
import webshop.webshop.repository.MealRepository;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;

@Controller
public class MealController {

    private MealRepository mealRepository;

    public MealController(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    @GetMapping("/meal")
    public String meal(Model model){
        model.addAttribute("meal", mealRepository.findAll());
        return "meal";
    }

    @GetMapping("/addMeal")
    public String addBooking(Model model){
        model.addAttribute("meal", new Meal());
        model.addAttribute("food", mealRepository.findAll());

        return "addMeal";
    }

    @PostMapping("/addMeal")
    public String addBooking(HttpServletRequest request){
        String food = request.getParameter("food");
        Meal meal = new Meal(food);
        mealRepository.save(meal);

        return "redirect:/meal";
    }



}
