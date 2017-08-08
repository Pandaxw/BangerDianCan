package banger.action.controller;
import banger.action.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/Car")
public class CarController {
    //add to car
    @Resource
    CarService carService;

    @ResponseBody
    @RequestMapping("/addTocar")
    public String addTocar(Model model, String productid, HttpSession session){
        carService.addProduct(productid,session);
    }


}
