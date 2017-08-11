package banger.action.controller;
import banger.action.model.Car;
import banger.action.service.CarService;


import banger.action.util.ProductNum;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
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
    public void changeCar(@RequestBody Map<String, Object> product,HttpSession session){
        Map<String, Object> resource=product;
        Map<String, Object> result=new HashMap<String, Object>();
        String productid=resource.get("productid").toString();
        int num=Integer.valueOf(resource.get("productnum").toString());
        carService.updateProductNum(session,productid,num);
    }
    @ResponseBody
    @RequestMapping("/removeMycar")
    public void removeProduct(@RequestBody Map<String, Object> product,HttpSession session){
        Map<String, Object> res=product;
        String productid=res.get("productid").toString();
        carService.removeProduct(session,productid);
    }
    @ResponseBody
    @RequestMapping("/selectMycar")
    public Object selectMycar(HttpSession session){
        List<ProductNum> carList= new ArrayList<ProductNum>();
        carList= carService.myCar(session);
        Map<String, Object> result=new HashMap<>();
        result.put("carList",carList);
        return result;
    }

}
