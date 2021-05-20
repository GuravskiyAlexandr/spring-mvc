package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import web.sevice.CarService;

@Controller
@RequestMapping(value = "cars")
public class CarController {
    @Autowired
    CarService carService;


    @GetMapping(value = "/{count}")
    public String printCar(ModelMap model, @PathVariable Integer count) {
        model.addAttribute("cars", carService.getListCars(count));
        return "cars";
    }
    @GetMapping
    public String printAllCar(ModelMap model) {
        model.addAttribute("cars", carService.getAllCars());
        return "cars";
    }
}
