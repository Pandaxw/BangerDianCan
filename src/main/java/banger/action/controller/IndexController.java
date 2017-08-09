package banger.action.controller;

import banger.action.model.Product;
import banger.action.service.ProductService;
import banger.action.tag.BaseController;
import banger.action.util.ProductUtil;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zgx zhangguangxing on 2017/8/7.
 * 该控制主要使用于对项目启动或者是用户登录后的首页
 */
@Controller
@RequestMapping("")
public class IndexController extends BaseController{

    @Resource
    private ProductService productService;

    @RequestMapping("index")
    public String  index(@RequestParam(value = "pageNum", required = false, defaultValue = "1") int l,
                         @RequestParam(value = "pageSize", required = false, defaultValue = "12") int s, ModelMap modelMap, HttpServletRequest request){
        List<ProductUtil> list = new ArrayList<>();
        list = productService.getAllProduct(new RowBounds((l - 1) * s, s));
        int totalCount = productService.getAllProduct(new RowBounds()).size();
        modelMap.addAttribute("totalCount",totalCount);
        modelMap.addAttribute("list",list);
        initPage(modelMap, l, s, totalCount);
        return "index";
    }
    @RequestMapping("indexName")
    public String  getProductByname(@RequestParam(value = "pageNum", required = false, defaultValue = "1") int l,
                         @RequestParam(value = "pageSize", required = false, defaultValue = "12") int s,@RequestParam ("prdoductname")String name, ModelMap modelMap){
        List<ProductUtil> list = new ArrayList<>();
        list = productService.getAllProductByName(new RowBounds((l - 1) * s, s),name);
        int totalCount = productService.getAllProductByName(new RowBounds(),name).size();
        modelMap.addAttribute("totalCount",totalCount);
        modelMap.addAttribute("list",list);
        initPage(modelMap, l, s, totalCount);
        return "index";
    }
    @RequestMapping("indexOrder")
    public String  getProductByorder(@RequestParam(value = "pageNum", required = false, defaultValue = "1") int l,
                         @RequestParam(value = "pageSize", required = false, defaultValue = "12") int s,@RequestParam("order") int order, ModelMap modelMap){
        List<ProductUtil> list = new ArrayList<>();
        list = productService.getAllProductByorder(new RowBounds((l - 1) * s, s),order);
        int totalCount = productService.getAllProductByorder(new RowBounds(),order).size();
        modelMap.addAttribute("totalCount",totalCount);
        modelMap.addAttribute("list",list);
        initPage(modelMap, l, s, totalCount);
        return "index";
    }
    @RequestMapping("indexPrice")
    public String  getProductByPrice(@RequestParam(value = "pageNum", required = false, defaultValue = "1") int l,
                         @RequestParam(value = "pageSize", required = false, defaultValue = "12") int s,int lowprice,int heightprice, ModelMap modelMap){
        List<ProductUtil> list = new ArrayList<>();
        list = productService.getAllProductBylowheight(new RowBounds((l - 1) * s, s),lowprice,heightprice);
        int totalCount = productService.getAllProductBylowheight(new RowBounds(),lowprice,heightprice).size();
        modelMap.addAttribute("totalCount",totalCount);
        modelMap.addAttribute("list",list);
        initPage(modelMap, l, s, totalCount);
        return "index";
    }


}