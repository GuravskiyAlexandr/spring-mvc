package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import web.sevice.CarService;

import java.util.Map;

@Controller
@RequestMapping(value = "/cars")
public class CarController {
    @Autowired
    CarService carService;


    @GetMapping
    public String printAllCar(ModelMap model, @RequestParam Map<String, String> reqPar) {
        Integer count = Integer.parseInt(reqPar.get("count") == null ? "5" : reqPar.get("count"));
        model.addAttribute("cars", carService.getListCars(count));
        return "cars";
    }
}
