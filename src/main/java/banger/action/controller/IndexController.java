package banger.action.controller;

import banger.action.model.Product;
import banger.action.service.ProductService;
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
public class IndexController {

    @Resource
    private ProductService productService;

    @RequestMapping("index")
    public String  index(@RequestParam(value = "pageNum", required = false, defaultValue = "1") int l,
                         @RequestParam(value = "pageSize", required = false, defaultValue = "20") int s, ModelMap modelMap, HttpServletRequest request){

        List<Product> list = new ArrayList<>();
        RowBounds rowBounds = new RowBounds();
        list = productService.getAllProduct(rowBounds);
        modelMap.addAttribute("list",list);
        return "index";
    }
}
