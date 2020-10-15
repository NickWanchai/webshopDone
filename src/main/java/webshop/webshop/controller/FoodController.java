package webshop.webshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import webshop.webshop.model.Food;
import webshop.webshop.repository.FoodRepository;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FoodController {

   /*@Autowired
    FoodService foodService;
    */

    private FoodRepository foodRepository;

    public FoodController(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @GetMapping("/food")
    public String food(Model model){

        model.addAttribute("foods", foodRepository.findAll());

        return "food";
    }

    @GetMapping("/addFood")
    public String addFood(Model model){
        model.addAttribute("food", new Food());
        return "addFood";
    }

    @PostMapping("/addFood")
    public String addFood(HttpServletRequest request){
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));;
        Food food = new Food(name, price);
        foodRepository.save(food);

        return "redirect:/food";
    }

}
