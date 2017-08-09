package banger.action.controller;
import banger.action.model.Car;
import banger.action.service.CarService;
import banger.action.util.ProductNum;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/Car")
public class CarController {
    //add to car
    @Resource
    CarService carService;

    @ResponseBody
    @RequestMapping("/addTocar")
    public void addTocar(@RequestBody Map<String, Object> product, HttpSession session){
        Map<String, Object> result=product;
         String productid= result.get("productid").toString();
         carService.addProduct(session,productid);
    }
    @ResponseBody
    @RequestMapping("/updataMycar")
    public Object changeCar(@RequestBody Map<String, Object> product,HttpSession session){
        Map<String, Object> resource=product;
        Map<String, Object> result=new HashMap<String, Object>();
        String productid=resource.get("productid").toString();
        int num=Integer.valueOf(resource.get("productnum").toString());
        carService.updateProductNum(session,productid,num);
        Car car=carService.selectMyproduct(session,productid);
        result.put("car",car);
        return  result;
    }
    @ResponseBody
    @RequestMapping("/selectMycar")
    public String selectMycar(HttpSession session, Model model){
        List<ProductNum> productNumList= carService.myCar(session);
        model.addAttribute(productNumList);
        return "addCar";
    }

}
