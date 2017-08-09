package banger.action.service.impl;

import banger.action.dao.PictureDAO;
import banger.action.dao.ProductDAO;
import banger.action.model.Picture;
import banger.action.model.Product;
import banger.action.service.ProductService;
import banger.action.util.ProductUtil;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zgx on 2017/8/7.
 */
@Service("ProductService")
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductDAO productDAO;
    @Resource
    private PictureDAO pictureDAO;

    public List<ProductUtil> getProductUtil( List<Product> productlist){
        List<ProductUtil> list = new ArrayList<>();
        for (Product product : productlist){
            ProductUtil productUtil = new ProductUtil();
            productUtil.setProduct(product);
            List<Picture> pictureList  = new ArrayList<>();
            pictureList = pictureDAO.selectprctureByproductId(product.getProductId());
            productUtil.setPictureList(pictureList);
            list.add(productUtil);
        }
        return list;
    }
    @Override
    public List<ProductUtil> getAllProduct(RowBounds rowBounds) {
        List<Product> list = new ArrayList<>();
        list = productDAO.seclctAllProduct(rowBounds);
        return getProductUtil(list);
    }

    @Override
    public List<ProductUtil> getAllProductByName(RowBounds rowBounds, String name) {
        List<Product> list = new ArrayList<>();
        list = productDAO.getProductsByName(name, rowBounds);
        return getProductUtil(list);
    }

    @Override
    public List<ProductUtil> getAllProductByorder(RowBounds rowBounds, int order) {
        List<Product> list = new ArrayList<>();
        String str = new String();
        if ( order == 1){
            str = "product_price";
        }else{
            str = "product_hass_selled";
        }
        list = productDAO.getProductOrderbyHassselled(rowBounds, str);
        return getProductUtil(list);
    }

    @Override
    public List<ProductUtil> getAllProductBylowheight(RowBounds rowBounds, int lowPrice, int heightPrice) {
        List<Product> list = new ArrayList<>();
        list = productDAO.getProductByBetween(lowPrice, heightPrice, rowBounds);
        return getProductUtil(list);
    }
}
