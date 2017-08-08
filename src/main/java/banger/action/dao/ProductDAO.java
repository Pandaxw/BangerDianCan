package banger.action.dao;

import banger.action.model.Product;
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
}