package banger.action.service;

import banger.action.util.ProductUtil;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * Created by Administrator on 2017/8/7.
 */
public interface ProductService {

    /**
     * 得到全部的商品
     * @param rowBounds
     * @return
     */
    List<ProductUtil> getAllProduct(RowBounds rowBounds);

    /**
     * 通过名字得到部分商品
     * @param
     * @param rowBounds
     * @return
     */
    List<ProductUtil> getAllProductByName(RowBounds rowBounds,String name);

    /**
     * 通过不同的标签排序
     * @param order
     * @param rowBounds
     * @return
     */
    List<ProductUtil> getAllProductByorder(RowBounds rowBounds,int order);

    /**
     * 通过价格区间进行查询
     *@param heightPrice
     * @param lowPrice
     * @param rowBounds
     * @return
     */
    List<ProductUtil> getAllProductBylowheight(RowBounds rowBounds,int lowPrice , int heightPrice);


}
