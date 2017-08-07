package banger.action.service;

import banger.action.model.Product;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * Created by Administrator on 2017/8/7.
 */
public interface ProductService {

    List<Product> getAllProduct(RowBounds rowBounds);
}
