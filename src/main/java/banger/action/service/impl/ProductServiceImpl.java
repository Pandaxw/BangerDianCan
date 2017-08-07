package banger.action.service.impl;

import banger.action.dao.ProductDAO;
import banger.action.model.Product;
import banger.action.service.ProductService;
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
    @Override
    public List<Product> getAllProduct(RowBounds rowBounds) {
        List<Product> list = new ArrayList<>();
        list = productDAO.seclctAllProduct(rowBounds);
        return list;
    }
}
