package banger.action.dao;

import banger.action.model.Product;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ProductDAO {

    /**
     * 查询全部的菜品（主页上使用）
     * RowBounds分页使用
     * @param rowBounds
     * @return
     */
    List<Product> seclctAllProduct(RowBounds rowBounds);

    /**
     * 通过商品id查询商品的详情
     * @param productId
     * @return
     */
    Product getProductByid(String productId,RowBounds rowBounds);
    Product selectProductByid(String productId);
    /**
     * 通过商品名字进行模糊查询
     * @param productname
     * @return
     */
    List<Product> getProductsByName(@Param("productname")String productname, RowBounds rowBounds);

    /**
     * 按照销量/价格进行排序
     * @param rowBounds
     * @return
     */
    List<Product> getProductOrderbyHassselled(RowBounds rowBounds,@Param("order")String  order);

    /**
     * 根据价格进行查询
     * @param lowPrice
     * @param heightPrice
     * @return
     */
    List<Product> getProductByBetween(int lowPrice , int heightPrice,RowBounds rowBounds);
}